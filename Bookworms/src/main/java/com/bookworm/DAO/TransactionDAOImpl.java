package com.bookworm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Transaction;
import com.bookworm.repository.TransactionRepository;


@Component
public class TransactionDAOImpl implements TransactionDAO {

	@Autowired
	TransactionRepository trscRepo;
	@Override
	public List<Transaction> getallTransaction() {
		return this.trscRepo.findAll();
	}

	@Override
	public Transaction getTransactionById(Integer id) {
		return this.trscRepo.getById(id);
	}

	@Override
	public Transaction saveTransaction(Transaction trsc) {
		return this.trscRepo.save(trsc);
	}

	@Override
	public Transaction updateTransaction(Transaction trsc) {
		return this.trscRepo.save(trsc);
	}

	@Override
	public String deleteTransactionById(Integer id) {
		if(this.trscRepo.existsById(id)){
			this.trscRepo.deleteById(id);
			return "Transaction DELTED";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}

}
