package com.finastra.dao;


import java.sql.Time;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finastra.entity.Accounts;
import com.finastra.entity.BankCustomer;
import com.finastra.entity.Transactions;

//For getting configuration from .xml file
@Repository
public class BankCustomerImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addCustomer(BankCustomer bc) {
	
		Session session=sessionFactory.getCurrentSession();
		session.save(bc);
		
	}

	@Override
	@Transactional
	public int authenticate(String uname, String pass) {

		   Session currSession = sessionFactory.getCurrentSession();
	       
	        //Query using Hibernate Query Language
		   //BankCustomer must be name of Entity class not SQL table bankcustomer
	     
	        List<BankCustomer> list =currSession.createQuery("from BankCustomer b where b.email=:email and b.password=:password",BankCustomer.class)
	        						 .setParameter("email",uname)
	        					     .setParameter("password",pass)
	        					     .getResultList();
	   
	        if (list != null) {
	            return list.get(0).getId();
	        }
	   
	    return 0;             
		
	}

	@Override
	@Transactional
	public void addAccount(Accounts acc) {
		Session session=sessionFactory.getCurrentSession();
		
		//Set initial balance as 0
		acc.setBalance(0);
		session.save(acc);
		System.out.print("Account created with account number:"+acc.getAccountid());
		
	}

	@Override
	@Transactional
	//based on current customer id and account id check it is valid account or not
	public int validAccount(int accountid,int cid) {
		Session session=sessionFactory.getCurrentSession();
		
		List<Accounts> list= session.createQuery("from Accounts where accountid=:accountid and custid=:custid",Accounts.class)
						.setParameter("accountid",accountid)
						.setParameter("custid",cid)
						.getResultList();
		if(!list.isEmpty())
			return 1;
		return 0;
	}
	
	@Override
	@Transactional
	public Accounts fetchAccount(int aid) {
		Session session=sessionFactory.getCurrentSession();
		List<Accounts> list = session.createQuery("from Accounts where accountid=:accountid",Accounts.class)
				        .setParameter("accountid",aid)
				        .getResultList();
		return list.get(0);
	}
	@Override
	@Transactional
	public void deposit(int aid, double amt) {
		
		 Session session=sessionFactory.getCurrentSession();
		 
		 //Fetch current account to update balance
		    Accounts acc=fetchAccount(aid);
		    acc.setBalance(acc.getBalance()+amt);
		    session.update(acc);
		   
	      //Inserting to transactions
	     	Transactions t=new Transactions();
	     	t.setAccountid(aid);
	     	t.setOperation("Deposit");
	     	java.util.Date date = new java.util.Date();
	     	t.setDate(date);
	     	Time time=Time.valueOf(java.time.LocalTime.now());
	     	t.setTime(time);
	     	t.setAmount(amt);
            session.save(t);
	    
		
	}

	@Override
	@Transactional
	public int withdraw(int aid, double amt) {
		 Session session=sessionFactory.getCurrentSession();
		 //Fetch current account to update balance
		    Accounts acc=fetchAccount(aid);
		    
		  //Check balance is sufficient to withdraw  
		    if(acc.getBalance()>=amt) {
		    	acc.setBalance(acc.getBalance()-amt);
		    	session.update(acc);
		    	
		    //Inserting to transactions
		   	Transactions t=new Transactions();
		   	t.setAccountid(aid);
	     	t.setOperation("Withdraw");
	     	t.setAmount(amt);
	     	
		   	//Set current date and time
	     	java.util.Date date = new java.util.Date();
		   	t.setDate(date);
	     	Time time=Time.valueOf(java.time.LocalTime.now());
		    t.setTime(time);
		   	session.save(t);
	        return 1;
	    }
	return 0;      
	}

	@Override
	@Transactional
	public void transfer(int fromacc, int toacc, double amt) {
		
		int i=withdraw(fromacc, amt);
		
		//if balance is sufficient and withdraw happens then only deposit to 
		//receivers account
		if(i==1)
			deposit(toacc, amt);
		else
			System.out.print("Check balance");
	}

	@Override
	@Transactional
	public List<Transactions> viewTransactions(int aid) {
		// Getting current session
		Session currentSession = sessionFactory.getCurrentSession();
						
		
		// Getting the Results of the Query
		List<Transactions> transactions =currentSession.createQuery("from Transactions where accountid=:accountid", Transactions.class)
							.setParameter("accountid", aid)
							.getResultList();
		return transactions;
	}

	@Override
	@Transactional
	public List<Accounts> viewAccounts(int custid) {
		
		Session s=sessionFactory.getCurrentSession();
		
		List<Accounts> accnts=s.createQuery("from Accounts where custid=:custid",Accounts.class)
				.setParameter("custid",custid)
				.getResultList();
		
		return accnts;
		
	}

	
	

}
