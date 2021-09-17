package com.bookworm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int acc_id;
	String Bank_name;
	String branch;
	String ifsc;
	int acc_number;
	String acc_type;
	String pan_no;
	
	@OneToOne(mappedBy="bankacc")
	private Publisher publisher;
	
	@OneToOne(mappedBy="bankacc")
	private Author author;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getBank_name() {
		return Bank_name;
	}
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public BankAccount(int acc_id, String bank_name, String branch, String ifsc, int acc_number, String acc_type,
			String pan_no) {
		super();
		this.acc_id = acc_id;
		Bank_name = bank_name;
		this.branch = branch;
		this.ifsc = ifsc;
		this.acc_number = acc_number;
		this.acc_type = acc_type;
		this.pan_no = pan_no;
	}
	@Override
	public String toString() {
		return "BankAccount [acc_id=" + acc_id + ", Bank_name=" + Bank_name + ", branch=" + branch + ", ifsc=" + ifsc
				+ ", acc_number=" + acc_number + ", acc_type=" + acc_type + ", pan_no=" + pan_no + "]";
	}
	
	
}
