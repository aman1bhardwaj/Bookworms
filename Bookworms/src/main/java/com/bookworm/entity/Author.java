package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int auth_id;
	String author;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int auth_id, String author) {
		this.auth_id = auth_id;
		this.author = author;
	}

	public int getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Author [auth_id=" + auth_id + ", author=" + author + "]";
	}
	
	

}
