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

import com.bookworm.entity.Address;
import com.bookworm.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressSer;

	@GetMapping("/address/all")
	public List<Address> getAllAddress(){
		return this.addressSer.getallAddress();
	}
	
	@GetMapping("/address/{id}")
	public Address getAddressById(@PathVariable("id") Integer id) {
		return this.addressSer.getAddressById(id);
	}
	
	
	@PostMapping("/address")
	public Address saveAddress( @RequestBody Address address) {
			return this.addressSer.saveAddress(address);
	}
	
	
	@PutMapping("/address")
	public Address updateAddress( @RequestBody Address address) {
			return this.addressSer.updateAddress(address);
	}
	
	
	@DeleteMapping("/address/{id}")
	public String deleteAddress(@PathVariable("id") Integer id) {
		return this.addressSer.deleteAddressById(id);
	}
}
