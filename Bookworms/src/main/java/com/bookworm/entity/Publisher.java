package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pub_id;
	String name;
	
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publisher(int pub_id, String name) {
		this.pub_id = pub_id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Publisher [pub_id=" + pub_id + ", name=" + name + "]";
	}
	
	
	
}
