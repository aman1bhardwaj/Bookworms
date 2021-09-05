package com.bookworm.DAO;

import java.util.List;
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

	@Override
	public Publisher SavePublisher(Publisher pub) {
		// TODO Auto-generated method stub
		return this.pubrepo.save(pub);
	}

	@Override
	public List<Publisher> GetallPublisher() {
		// TODO Auto-generated method stub
		return this.pubrepo.findAll();
	}

}
