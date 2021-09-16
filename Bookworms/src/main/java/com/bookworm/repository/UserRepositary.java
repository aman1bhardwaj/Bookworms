package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.UserTable;

@Repository
public interface UserRepositary  extends  JpaRepository<UserTable,Integer> {

}
