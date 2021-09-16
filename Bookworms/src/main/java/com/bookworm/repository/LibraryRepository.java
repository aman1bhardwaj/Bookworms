package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Library;


@Repository
public interface LibraryRepository extends  JpaRepository<Library,Integer> {

}
