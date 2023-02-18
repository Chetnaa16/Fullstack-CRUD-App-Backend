package com.codewithmegha.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithmegha.fullstackbackend.model.User;

public interface userRepository extends JpaRepository<User, Long> {

}
