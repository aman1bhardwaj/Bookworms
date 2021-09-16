package com.bookworm.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Myshelf {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id	;
	private int u_id	;
	private int	p_id	;
	private String tr_type	;
	private Date prod_expiry	;
	public Myshelf() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Myshelf [s_id=" + s_id + ", u_id=" + u_id + ", p_id=" + p_id + ", tr_type=" + tr_type + ", prod_expiry="
				+ prod_expiry + "]";
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	public Myshelf(int s_id, int u_id, int p_id, String tr_type, Date prod_expiry) {
		super();
		this.s_id = s_id;
		this.u_id = u_id;
		this.p_id = p_id;
		this.tr_type = tr_type;
		this.prod_expiry = prod_expiry;
	}
	
	

}
