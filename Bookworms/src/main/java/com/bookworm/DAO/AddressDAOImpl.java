package com.bookworm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Address;
import com.bookworm.repository.AddressRepository;


@Component
public class AddressDAOImpl  implements AddressDAO {

	@Autowired
	AddressRepository addressRepo;

	@Override
	public List<Address> getallAddress() {
		return this.addressRepo.findAll();
	}

	@Override
	public Address getAddressById(Integer id) {
		return this.addressRepo.getById(id);
	}

	@Override
	public Address saveAddress(Address address) {
		return this.addressRepo.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		return this.addressRepo.save(address);
	}

	@Override
	public String deleteAddressById(Integer id) {
		if(this.addressRepo.existsById(id)){
			this.addressRepo.deleteById(id);
			return "Address DELTED";
		}
			
		
		return "OBJECT/ ID NOT FOUND TO DELETE";
	}
	

}
