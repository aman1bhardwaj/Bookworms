package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pub_id;
	String publisher;
	
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publisher(int pub_id, String publisher) {
		this.pub_id = pub_id;
		this.publisher = publisher;
	}

	public int getPub_id() {
		return pub_id;
	}

	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Publisher [pub_id=" + pub_id + ", publisher=" + publisher + "]";
	}

	
	
}
