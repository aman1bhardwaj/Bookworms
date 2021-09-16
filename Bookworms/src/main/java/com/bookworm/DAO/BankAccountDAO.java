package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.BankAccount;


public interface BankAccountDAO {
	public List<BankAccount>  getallBankAccount();
	public BankAccount getBankAccountById(Integer id);
	public BankAccount saveBankAccount(BankAccount baccount);
	public BankAccount updateBankAccount(BankAccount baccount);
	public String deleteBankAccountById(Integer id);
}
