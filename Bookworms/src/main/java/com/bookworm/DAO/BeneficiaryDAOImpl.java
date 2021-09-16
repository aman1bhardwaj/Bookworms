package com.bookworm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Beneficiary;
import com.bookworm.repository.BeneficiaryRepository;


@Component
public class BeneficiaryDAOImpl implements BeneficiaryDAO {

	@Autowired
	BeneficiaryRepository benifRepo;
	
	@Override
	public List<Beneficiary> getallBeneficiary() {
		return this.benifRepo.findAll();
	}

	@Override
	public Beneficiary getBeneficiaryById(Integer id) {
		return this.benifRepo.getById(id);
	}

	@Override
	public Beneficiary saveBeneficiary(Beneficiary benfi) {
		return this.benifRepo.save(benfi);
	}

	@Override
	public Beneficiary updateBeneficiary(Beneficiary benfi) {
		return this.benifRepo.save(benfi);
	}

	@Override
	public String deleteBeneficiaryById(Integer id) {
		if(this.benifRepo.existsById(id)){
			this.benifRepo.deleteById(id);
			return "Beneficiary Deleted";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}

}
