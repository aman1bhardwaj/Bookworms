package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pub_id;
	String name;
	String email;
	int mobile;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "pub_add_id" ,referencedColumnName = "add_id")
	Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "pub_bank_acc_id" ,referencedColumnName = "acc_id")
	BankAccount bankacc;

	public Publisher() {
		super();
	}

	public Publisher(int pub_id, String name, String email, int mobile, Address address, BankAccount bankacc) {
		this.pub_id = pub_id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.bankacc = bankacc;
	}

	public int getPub_id() {
		return pub_id;
	}

	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankAccount getBankacc() {
		return bankacc;
	}

	public void setBankacc(BankAccount bankacc) {
		this.bankacc = bankacc;
	}

	@Override
	public String toString() {
		return "Publisher [pub_id=" + pub_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", bankacc=" + bankacc + "]";
	}

	
}
