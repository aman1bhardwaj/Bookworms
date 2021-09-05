package com.bookworm.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookworm.entity.Publisher;
import com.bookworm.repository.PublisherRepository;

@Component
public class PublisherDAOImpl implements PublisherDAO{
	
	@Autowired
	PublisherRepository pubrepo;

	@Override
	public Optional<Publisher> getProductByPublisher(int pub_id) {
		// TODO Auto-generated method stub
		return this.pubrepo.findById(pub_id);
	}

}
