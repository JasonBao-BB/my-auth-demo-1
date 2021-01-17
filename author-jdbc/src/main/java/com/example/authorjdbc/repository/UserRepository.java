package com.example.authorjdbc.repository;

import com.example.authorjdbc.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
