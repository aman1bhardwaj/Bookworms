package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entity.BankAccount;



@Repository
public interface BankAccountRepository extends  JpaRepository<BankAccount, Integer> {

}
