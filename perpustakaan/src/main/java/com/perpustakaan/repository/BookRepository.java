package com.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perpustakaan.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
