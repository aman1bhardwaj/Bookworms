package com.bookworm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookworm.DAO.PublisherDAO;
import com.bookworm.entity.Publisher;



@Service
public class PublisherService {

	
	@Autowired
	PublisherDAO pubdao;
	
	public Optional<Publisher> GetProductByPublisher(int pub_id){
		return this.pubdao.getProductByPublisher(pub_id);
	}
	
	public Publisher savePublisher(Publisher pub) {
		return this.pubdao.SavePublisher(pub);
	}
	
	public List<Publisher> getallPublisher(){
		return this.pubdao.GetallPublisher();
	}
	
}
