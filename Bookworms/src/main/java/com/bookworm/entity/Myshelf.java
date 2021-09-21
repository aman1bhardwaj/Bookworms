package com.bookworm.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Myshelf {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shelf_id	;
	@OneToOne(targetEntity=UserTable.class)
	@JoinColumn(name = "user_id",referencedColumnName = "u_id")
	private UserTable user	;
	@OneToMany(targetEntity=Product.class)
	@JoinColumn(name = "prod_id",referencedColumnName = "p_id")
	private Product	product	;
	private String tr_type	;
	private Date prod_expiry	;
	public Myshelf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Myshelf(int shelf_id, String tr_type, Date prod_expiry) {
		this.shelf_id = shelf_id;
		this.tr_type = tr_type;
		this.prod_expiry = prod_expiry;
	}
	public int getShelf_id() {
		return shelf_id;
	}
	public void setShelf_id(int shelf_id) {
		this.shelf_id = shelf_id;
	}
	public String getTr_type() {
		return tr_type;
	}
	public void setTr_type(String tr_type) {
		this.tr_type = tr_type;
	}
	public Date getProd_expiry() {
		return prod_expiry;
	}
	public void setProd_expiry(Date prod_expiry) {
		this.prod_expiry = prod_expiry;
	}
	@Override
	public String toString() {
		return "Myshelf [shelf_id=" + shelf_id + ", user=" + user + ", product=" + product + ", tr_type=" + tr_type
				+ ", prod_expiry=" + prod_expiry + "]";
	}
	
}
