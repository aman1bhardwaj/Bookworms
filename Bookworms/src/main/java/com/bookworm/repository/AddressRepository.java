package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Address;


@Repository
public interface AddressRepository extends  JpaRepository<Address, Integer>{

}
