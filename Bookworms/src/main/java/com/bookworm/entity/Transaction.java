package com.bookworm.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tr_id	;
	
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Product.class)
	@JoinColumn(name="prod_id")
	Product prod_id	;
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=UserTable.class)
	@JoinColumn(name="u_id")
	private int  u_id;
	private String tr_type	;
	private int  no_days	;
	private int amt	;
	private Date date	;
	private String status	;
	
	public Transaction() {
		super();
	}

	public Transaction(int tr_id, Product prod_id, int u_id, String tr_type, int no_days, int amt, Date date,
			String status) {
		this.tr_id = tr_id;
		this.prod_id = prod_id;
		this.u_id = u_id;
		this.tr_type = tr_type;
		this.no_days = no_days;
		this.amt = amt;
		this.date = date;
		this.status = status;
	}

	public int getTr_id() {
		return tr_id;
	}

	public void setTr_id(int tr_id) {
		this.tr_id = tr_id;
	}

	public Product getProd_id() {
		return prod_id;
	}

	public void setProd_id(Product prod_id) {
		this.prod_id = prod_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getTr_type() {
		return tr_type;
	}

	public void setTr_type(String tr_type) {
		this.tr_type = tr_type;
	}

	public int getNo_days() {
		return no_days;
	}

	public void setNo_days(int no_days) {
		this.no_days = no_days;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transaction [tr_id=" + tr_id + ", prod_id=" + prod_id + ", u_id=" + u_id + ", tr_type=" + tr_type
				+ ", no_days=" + no_days + ", amt=" + amt + ", date=" + date + ", status=" + status + "]";
	}

	
	

}
