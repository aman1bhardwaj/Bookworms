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

	@OneToOne(mappedBy="add_id")
	private UserTable user;
	
	@OneToOne(mappedBy="address")
	private Beneficiary benif;
	
	@OneToOne(mappedBy="address")
	private Publisher publish;
	
	@OneToOne(mappedBy="address")
	private Author author;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int add_id, String address, String city, String district, int pin_code, UserTable user,
			Beneficiary benif, Publisher publish, Author author) {
		this.add_id = add_id;
		this.address = address;
		this.city = city;
		District = district;
		this.pin_code = pin_code;
		this.user = user;
		this.benif = benif;
		this.publish = publish;
		this.author = author;
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

	public UserTable getUser() {
		return user;
	}

	public void setUser(UserTable user) {
		this.user = user;
	}

	public Beneficiary getBenif() {
		return benif;
	}

	public void setBenif(Beneficiary benif) {
		this.benif = benif;
	}

	public Publisher getPublish() {
		return publish;
	}

	public void setPublish(Publisher publish) {
		this.publish = publish;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", address=" + address + ", city=" + city + ", District=" + District
				+ ", pin_code=" + pin_code + ", user=" + user + ", benif=" + benif + ", publish=" + publish
				+ ", author=" + author + "]";
	}

	
	
	
}
