package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.chary.spring.hibernate.entities.Account;



public interface AccountService {

	public Account saveAccount(Account account);

	public List<Account> getAccounts();

	public Optional<Account> getAccountById(int accountId);

	public String deleteAccount(int accountId);

	public Account updateAccount(Account account);

}
