package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.BankAccount;


public interface BankAccountDAO {
	public List<BankAccount>  getallBankAccount();
	public Optional<BankAccount> getBankAccountById(int acc_id);
	public BankAccount saveBankAccount(BankAccount baccount);
	public BankAccount updateBankAccount(BankAccount baccount);
	public String deleteBankAccountById(Integer id);
}
