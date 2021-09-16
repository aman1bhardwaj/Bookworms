package com.bookworm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Beneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ben_id;
	private String name;
	private String email;
	private Long mobile;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ben_add_id",referencedColumnName = "ben_add_id")
	private Address ben_add_id;
	
	@OneToOne
	@JoinColumn(name = "acc_id",referencedColumnName = "acc_id")
	private BankAccount bankaccount;

	public Beneficiary() {
		super();
	}

	public Beneficiary(int ben_id, String name, String email, Long mobile, BankAccount bankaccount) {
		this.ben_id = ben_id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.bankaccount = bankaccount;
	}

	public int getBen_id() {
		return ben_id;
	}

	public void setBen_id(int ben_id) {
		this.ben_id = ben_id;
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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public String toString() {
		return "Beneficiary [ben_id=" + ben_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", bankaccount=" + bankaccount + "]";
	}
	
	
	
	/*@OneToOne(mappedBy="ben_id")
	private Address address;*/
	
	
	
	

}
