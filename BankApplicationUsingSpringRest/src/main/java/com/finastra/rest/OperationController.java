package com.finastra.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finastra.dao.CustomerDao;
import com.finastra.entity.Accounts;

@RestController
@RequestMapping("/api")
public class OperationController {

	@Autowired
	CustomerDao custdao;
		
	@PostMapping("/deposited")
	public void depositedPage(@RequestBody Accounts account) {

		
	     //Account exists or not
		Accounts accnt=custdao.fetchAccount(account.getAccountid());
		
		if(accnt!=null)
		{
			System.out.println("Account Validated");
			//Account id and amount to be added
			custdao.deposit(account.getAccountid(),account.getBalance());
		    System.out.print("Amount deposit sucess");
			
		}
		else
			System.out.println("Account does not exist or invalid");
	
	}
	
	@PostMapping("/withdrawn")
	public void withdraw(@RequestBody Accounts account) {

		
	     //Account exists or not
		Accounts accnt=custdao.fetchAccount(account.getAccountid());
		
		if(accnt!=null)
		{
			System.out.println("Account Validated");
			//Account id and amount to be added
			int i=custdao.withdraw(account.getAccountid(),account.getBalance());
		    System.out.print("Amount withdraw sucess");
			
		}
		else
			System.out.println("Account does not exist or invalid");
	
	}
	@PostMapping("/checkBalance/{accountId}")
	public double balance(@PathVariable int accountId) {

		
	     //Account exists or not
		Accounts accnt=custdao.fetchAccount(accountId);
		
		if(!accnt.equals(null))
		{
			
			return accnt.getBalance();
		}
		else
			System.out.println("Account does not exist or invalid");
	
		return 0.0;
	}
	
	@PostMapping("/transfer/{fromaccountId}")
	public void transferPage(@PathVariable int fromaccountId,@RequestBody Accounts acc) {

		
	     //Account exists or not
		Accounts accnt=custdao.fetchAccount(fromaccountId);
		
		if(!accnt.equals(null))
		{
			
			custdao.transfer(fromaccountId, acc.getAccountid(), acc.getBalance());
			System.out.println("Transfer success");
		}
		else
			System.out.println("Account does not exist or invalid");
	
		
	}
	
	
	
	
	
}

