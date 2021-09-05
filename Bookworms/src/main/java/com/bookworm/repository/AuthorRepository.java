package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
