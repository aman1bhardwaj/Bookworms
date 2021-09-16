package com.bookworm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.entity.Transaction;
import com.bookworm.service.TransactionService;


@RestController
public class TransactionController {
	@Autowired
	TransactionService TransactionSer;
	@GetMapping("/transaction/all")
	public List<Transaction> getAllTransaction(){
		return this.TransactionSer.getallTransaction();
	}
	
	@GetMapping("/transaction/{id}")
	public Transaction getTransactionById(@PathVariable("id") Integer id) {
		return this.TransactionSer.getTransactionById(id);
	}
	
	
	@PostMapping("/transaction")
	public Transaction saveTransaction( @RequestBody Transaction transaction) {
			return this.TransactionSer.saveTransaction(transaction);
	}
	
	
	@PutMapping("/transaction")
	public Transaction updateTransaction( @RequestBody Transaction transaction) {
			return this.TransactionSer.updateTransaction(transaction);
	}
	
	
	@DeleteMapping("/transaction/{id}")
	public String deleteTransaction(@PathVariable("id") Integer id) {
		return this.TransactionSer.deleteTransactionById(id);
	}
}
