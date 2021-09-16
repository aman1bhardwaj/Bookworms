package com.bookworm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.TransactionDAO;
import com.bookworm.entity.Transaction;



@Service
public class TransactionService {

	@Autowired
	TransactionDAO trscDao;
	
	public List<Transaction> getallTransaction() {
		return this.trscDao.getallTransaction();
	}


	public Transaction getTransactionById(Integer id) {

		return this.trscDao.getTransactionById(id);
	}


	public Transaction saveTransaction(Transaction trsc) {
		return this.trscDao.saveTransaction(trsc);
	}


	public Transaction updateTransaction(Transaction trsc) {
		return this.trscDao.updateTransaction(trsc);
	}


	public String deleteTransactionById(Integer id) {
	
		return this.trscDao.deleteTransactionById(id);
	}

}
