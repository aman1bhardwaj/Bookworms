package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer>{

}
