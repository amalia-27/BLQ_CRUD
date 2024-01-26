package com.perpustakaan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perpustakaan.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
