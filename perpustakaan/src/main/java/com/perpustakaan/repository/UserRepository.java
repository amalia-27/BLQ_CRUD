package com.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perpustakaan.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
