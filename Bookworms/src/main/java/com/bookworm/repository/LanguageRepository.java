package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
