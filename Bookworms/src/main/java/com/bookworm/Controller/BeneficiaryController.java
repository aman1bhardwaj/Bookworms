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

import com.bookworm.entity.Beneficiary;
import com.bookworm.service.BeneficiaryService;



@RestController
public class BeneficiaryController {
	@Autowired
	BeneficiaryService benifSer;
	
	@GetMapping("/beneficiary/all")
	public List<Beneficiary> getAllBeneficiary(){
		return this.benifSer.getallBeneficiary();
	}
	
	@GetMapping("/beneficiary/{id}")
	public Beneficiary getBeneficiaryById(@PathVariable("id") Integer id) {
		return this.benifSer.getBeneficiaryById(id);
	}
	
	
	@PostMapping("/beneficiary")
	public Beneficiary saveBeneficiary( @RequestBody Beneficiary benif) {
			return this.benifSer.saveBeneficiary(benif);
	}
	
	
	@PutMapping("/beneficiary")
	public Beneficiary updateBeneficiary( @RequestBody Beneficiary benif) {
			return this.benifSer.updateBeneficiary(benif);
	}
	
	
	@DeleteMapping("/beneficiary/{id}")
	public String deleteBeneficiary(@PathVariable("id") Integer id) {
		return this.benifSer.deleteBeneficiaryById(id);
	}
}
