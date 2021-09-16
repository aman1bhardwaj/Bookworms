package com.bookworm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.BeneficiaryDAO;
import com.bookworm.entity.Beneficiary;



@Service
public class BeneficiaryService {

	@Autowired
	BeneficiaryDAO benifDao;

	public List<Beneficiary> getallBeneficiary() {
		return this.benifDao.getallBeneficiary();
	}


	public Beneficiary getBeneficiaryById(Integer id) {

		return this.benifDao.getBeneficiaryById(id);
	}


	public Beneficiary saveBeneficiary(Beneficiary benif) {
		return this.benifDao.saveBeneficiary(benif);
	}


	public Beneficiary updateBeneficiary(Beneficiary benif) {
		return this.benifDao.updateBeneficiary(benif);
	}


	public String deleteBeneficiaryById(Integer id) {
	
		return this.benifDao.deleteBeneficiaryById(id);
	}
	
}
