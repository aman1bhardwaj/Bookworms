package com.bookworm.DAO;

import java.util.List;

import com.bookworm.entity.Address;


public interface AddressDAO {

	public List<Address>  getallAddress();
	public Address getAddressById(Integer id);
	public Address saveAddress(Address address);
	public Address updateAddress(Address address);
	public String deleteAddressById(Integer id);
}
