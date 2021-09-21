package com.bookworm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.BankAccount;
import com.bookworm.service.BankAccountService;


@RestController
public class BankAccountController {

	@Autowired
	BankAccountService baccountSer;
	
	@GetMapping("/baccount/all")
	public List<BankAccount> getAllBankAccount(){
		return this.baccountSer.getallBankAccount();
	}
	
	@GetMapping("/baccount/{id}")
	public Optional<BankAccount> getBankAccountById(@PathVariable("id") int acc_id) {
		return this.baccountSer.getBankAccountById(acc_id);
	}
	
	
	@PostMapping("/baccount")
	public BankAccount saveBankAccount( @RequestBody BankAccount baccount) {
			return this.baccountSer.saveBankAccount(baccount);
	}
	
	
	@PutMapping("/baccount")
	public BankAccount updateBankAccount( @RequestBody BankAccount baccount) {
			return this.baccountSer.updateBankAccount(baccount);
	}
	
	
	@DeleteMapping("/baccount/{id}")
	public String deleteBankAccount(@PathVariable("id") Integer id) {
		return this.baccountSer.deleteBankAccountById(id);
	}
}
