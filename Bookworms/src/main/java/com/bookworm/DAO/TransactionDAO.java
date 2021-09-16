package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.Transaction;


public interface TransactionDAO {

	public List<Transaction>  getallTransaction();
	public Transaction getTransactionById(Integer id);
	public Transaction saveTransaction(Transaction trsc);
	public Transaction updateTransaction(Transaction trsc);
	public String deleteTransactionById(Integer id);
}
