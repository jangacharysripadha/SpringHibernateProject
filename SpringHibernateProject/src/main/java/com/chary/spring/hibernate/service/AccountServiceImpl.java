package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chary.spring.hibernate.dao.AccountDao;
import com.chary.spring.hibernate.entities.Account;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public Account saveAccount(Account account) {
		return accountDao.save(account);
		
	}

	@Override
	public List<Account> getAccounts() {
		return (List<Account>) accountDao.findAll();
	}

	@Override
	public Optional<Account> getAccountById(int accountId) {
		return accountDao.findById(accountId);
	}

	@Override
	public String deleteAccount(int accountId) {
		accountDao.deleteById(accountId);
		return "accountId removed successfully:"+accountId;
	}

	@Override
	public Account updateAccount(Account account) {
		return accountDao.save(account);
	}

	
	

}
