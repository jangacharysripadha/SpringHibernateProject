package com.chary.spring.hibernate.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chary.spring.hibernate.entities.Account;
import com.chary.spring.hibernate.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account) throws Exception
	{
		return accountService.saveAccount(account);
	}
    
	@GetMapping("/selectAccount")
	public List<Account> getAllAccounts() throws Exception
	{
		return accountService.getAccounts();
	}
	
	@GetMapping("/selectAccount/{accountId}")
	public Optional<Account> getAccountById(@PathVariable int accountId)throws Exception
	{
		return accountService.getAccountById(accountId);
	}
    
	
	@DeleteMapping("/deleteAccount/{accountId}")
	public String deleteAccount(@PathVariable int accountId)throws Exception
	{
		return accountService.deleteAccount(accountId);
	}
} 
	