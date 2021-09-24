package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Address;


public interface AddressDAO {

	public List<Address>  getallAddress();
	public Optional<Address> getAddressById(int id);
	public Address saveAddress(Address address);
	public Address updateAddress(Address address);
	public String deleteAddressById(int id);
}
