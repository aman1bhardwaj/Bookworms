package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Myshelf;



@Repository
public interface MyshelfRepository extends  JpaRepository<Myshelf,Integer> {

}
