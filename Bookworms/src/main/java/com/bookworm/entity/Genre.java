package com.bookworm.entity;

import javax.persistence.*;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int gen_id;
	String genre;
	
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genre(int gen_id, String genre) {
		this.gen_id = gen_id;
		this.genre = genre;
	}

	public int getGen_id() {
		return gen_id;
	}

	public void setGen_id(int gen_id) {
		this.gen_id = gen_id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Genre [gen_id=" + gen_id + ", genre=" + genre + "]";
	}
	
	

}
