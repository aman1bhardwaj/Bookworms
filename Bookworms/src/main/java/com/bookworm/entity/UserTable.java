package com.bookworm.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class UserTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long u_id;
	private String uname;
	private String email;
	private int points;
	private Long mobile;
	private String pass;
	private int can_lent_products;
	
	@JsonFormat(pattern = "MM/dd/yyyy")
	private Date pack_expiry_date;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "add_id",referencedColumnName = "add_id")
	private Address add_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ben_id",referencedColumnName = "ben_id")
	private Beneficiary ben_id;
	
	
	

	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserTable(long u_id, String uname, String email, int points, Long mobile, String pass, int can_lent_products,
			Date pack_expiry_date, Address add_id, Beneficiary ben_id) {
		this.u_id = u_id;
		this.uname = uname;
		this.email = email;
		this.points = points;
		this.mobile = mobile;
		this.pass = pass;
		this.can_lent_products = can_lent_products;
		this.pack_expiry_date = pack_expiry_date;
		this.add_id = add_id;
		this.ben_id = ben_id;
	}

	public long getU_id() {
		return u_id;
	}

	public void setU_id(long u_id) {
		this.u_id = u_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getCan_lent_products() {
		return can_lent_products;
	}

	public void setCan_lent_products(int can_lent_products) {
		this.can_lent_products = can_lent_products;
	}

	public Date getPack_expiry_date() {
		return pack_expiry_date;
	}

	public void setPack_expiry_date(Date pack_expiry_date) {
		this.pack_expiry_date = pack_expiry_date;
	}

	public Address getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Address add_id) {
		this.add_id = add_id;
	}

	public Beneficiary getBen_id() {
		return ben_id;
	}

	public void setBen_id(Beneficiary ben_id) {
		this.ben_id = ben_id;
	}

	@Override
	public String toString() {
		return "UserTable [u_id=" + u_id + ", uname=" + uname + ", email=" + email + ", points=" + points + ", mobile="
				+ mobile + ", pass=" + pass + ", can_lent_products=" + can_lent_products + ", pack_expiry_date="
				+ pack_expiry_date + ", add_id=" + add_id + ", ben_id=" + ben_id + "]";
	}

	
	
	
}
