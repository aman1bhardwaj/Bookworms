package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.BankAccount;
import com.bookworm.repository.BankAccountRepository;


@Component
public class BankAccountDAOImpl implements BankAccountDAO {

	@Autowired
	BankAccountRepository baccountRepo;

	@Override
	public List<BankAccount> getallBankAccount() {
		return this.baccountRepo.findAll();
	}

	@Override
	public Optional<BankAccount> getBankAccountById(int acc_id) {
		return this.baccountRepo.findById(acc_id);
	}

	@Override
	public BankAccount saveBankAccount(BankAccount baccount) {
		return this.baccountRepo.save(baccount);
	}

	@Override
	public BankAccount updateBankAccount(BankAccount baccount) {
		return this.baccountRepo.save(baccount);
	}

	@Override
	public String deleteBankAccountById(Integer id) {
		if(this.baccountRepo.existsById(id)){
			this.baccountRepo.deleteById(id);
			return "Bank Account DELTED";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}
	

}
