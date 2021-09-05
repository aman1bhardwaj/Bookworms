package com.bookworm.DAO;

import java.util.Optional;

import com.bookworm.entity.Publisher;

public interface PublisherDAO {

	public Optional<Publisher> getProductByPublisher(int pub_id);
}