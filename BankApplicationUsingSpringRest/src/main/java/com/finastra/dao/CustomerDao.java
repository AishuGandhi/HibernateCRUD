package com.finastra.dao;

import java.util.List;

import com.finastra.entity.Accounts;
import com.finastra.entity.BankCustomer;
import com.finastra.entity.Transactions;

public interface CustomerDao {

	public void addCustomer(BankCustomer bc);
	public int authenticate(String uname,String password) ;
    public void addAccount(Accounts acc);
	public int validAccount(int aid,int cid);
	
	public void deposit(int aid,double amt);
	public int withdraw(int aid,double amt);
	public Accounts fetchAccount(int aid);
	public void transfer(int fromacc, int toacc, double amt);
	public List<Transactions> viewTransactions(int acctid);
	public List<Accounts> viewAccounts(int custid);
}
