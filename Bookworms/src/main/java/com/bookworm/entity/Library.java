package com.bookworm.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pack_id	;
	private int amount	;
	private Date duration	;
	private Date expiry	;
	private int no_prod	;
	public int getPack_id() {
		return pack_id;
	}
	public void setPack_id(int pack_id) {
		this.pack_id = pack_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public int getNo_prod() {
		return no_prod;
	}
	public void setNo_prod(int no_prod) {
		this.no_prod = no_prod;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int pack_id, int amount, Date duration, Date expiry, int no_prod) {
		super();
		this.pack_id = pack_id;
		this.amount = amount;
		this.duration = duration;
		this.expiry = expiry;
		this.no_prod = no_prod;
	}
	@Override
	public String toString() {
		return "Library [pack_id=" + pack_id + ", amount=" + amount + ", duration=" + duration + ", expiry=" + expiry
				+ ", no_prod=" + no_prod + "]";
	}

	
}
