package com.bookworm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int add_id;
	String address;
	String city;
	String District;
	int pin_code;
	int ben_add_id;

	@OneToOne(mappedBy="add_id")
	private UserTable user;
	
	@OneToOne(mappedBy="ben_add_id")
	private Beneficiary benif;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Address(int add_id, String address, String city, String district, int pin_code, int ben_add_id) {
		this.add_id = add_id;
		this.address = address;
		this.city = city;
		District = district;
		this.pin_code = pin_code;
		this.ben_add_id = ben_add_id;
	}



	public int getAdd_id() {
		return add_id;
	}



	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getDistrict() {
		return District;
	}



	public void setDistrict(String district) {
		District = district;
	}



	public int getPin_code() {
		return pin_code;
	}



	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}



	public int getBen_add_id() {
		return ben_add_id;
	}



	public void setBen_add_id(int ben_add_id) {
		this.ben_add_id = ben_add_id;
	}



	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", address=" + address + ", city=" + city + ", District=" + District
				+ ", pin_code=" + pin_code + ", ben_add_id=" + ben_add_id + ", user=" + user + ", benif=" + benif + "]";
	}



	
}
