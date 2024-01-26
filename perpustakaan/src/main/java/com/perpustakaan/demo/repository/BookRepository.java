package com.perpustakaan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perpustakaan.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
