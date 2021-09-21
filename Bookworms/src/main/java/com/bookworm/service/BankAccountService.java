package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.BankAccountDAO;
import com.bookworm.entity.BankAccount;

@Service
public class BankAccountService {

	@Autowired
	BankAccountDAO baccountDao;
	
	public List<BankAccount> getallBankAccount() {
		return this.baccountDao.getallBankAccount();
	}


	public Optional<BankAccount> getBankAccountById(int acc_id) {

		return this.baccountDao.getBankAccountById(acc_id);
	}


	public BankAccount saveBankAccount(BankAccount baccount) {
		return this.baccountDao.saveBankAccount(baccount);
	}


	public BankAccount updateBankAccount(BankAccount baccount) {
		return this.baccountDao.updateBankAccount(baccount);
	}


	public String deleteBankAccountById(Integer id) {
	
		return this.baccountDao.deleteBankAccountById(id);
	}

}
