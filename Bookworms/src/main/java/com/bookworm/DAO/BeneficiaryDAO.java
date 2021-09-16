package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.Beneficiary;



public interface BeneficiaryDAO {

	public List<Beneficiary>  getallBeneficiary();
	public Beneficiary getBeneficiaryById(Integer id);
	public Beneficiary saveBeneficiary(Beneficiary benfi);
	public Beneficiary updateBeneficiary(Beneficiary benfi);
	public String deleteBeneficiaryById(Integer id);
}
