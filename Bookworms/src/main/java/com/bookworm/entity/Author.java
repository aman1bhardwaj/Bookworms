package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int auth_id;
	String author_name;
	String email;
	int mobile;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "auth_add_id" ,referencedColumnName = "add_id")
	Address address;
	
	boolean has_beneficiary;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "auth_bank_acc_id" ,referencedColumnName = "acc_id")
	BankAccount bankacc;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int auth_id, String author_name, String email, int mobile, Address address, boolean has_beneficiary,
			BankAccount bankacc) {
		this.auth_id = auth_id;
		this.author_name = author_name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.has_beneficiary = has_beneficiary;
		this.bankacc = bankacc;
	}

	public int getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
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

	public boolean isHas_beneficiary() {
		return has_beneficiary;
	}

	public void setHas_beneficiary(boolean has_beneficiary) {
		this.has_beneficiary = has_beneficiary;
	}

	public BankAccount getBankacc() {
		return bankacc;
	}

	public void setBankacc(BankAccount bankacc) {
		this.bankacc = bankacc;
	}

	@Override
	public String toString() {
		return "Author [auth_id=" + auth_id + ", author_name=" + author_name + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", has_beneficiary=" + has_beneficiary + ", bankacc=" + bankacc + "]";
	}

}
