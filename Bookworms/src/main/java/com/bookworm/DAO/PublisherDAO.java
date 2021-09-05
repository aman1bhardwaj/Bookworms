package com.bookworm.DAO;

import java.util.List;
import java.util.Optional;

import com.bookworm.entity.Publisher;

public interface PublisherDAO {

	public Optional<Publisher> getProductByPublisher(int pub_id);
	public Publisher SavePublisher(Publisher pub);
	public List<Publisher> GetallPublisher();
}