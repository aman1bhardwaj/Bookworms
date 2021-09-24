package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.AddressDAO;
import com.bookworm.entity.Address;


@Service
public class AddressService {

	@Autowired
	AddressDAO addressDao;
	
	public List<Address> getallAddress() {
		return this.addressDao.getallAddress();
	}


	public Optional<Address> getAddressById(int id) {

		return this.addressDao.getAddressById(id);
	}


	public Address saveAddress(Address address) {
		return this.addressDao.saveAddress(address);
	}


	public Address updateAddress(Address address) {
		return this.addressDao.updateAddress(address);
	}


	public String deleteAddressById(int id) {
	
		return this.addressDao.deleteAddressById(id);
	}

}
