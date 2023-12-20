package com.perpustakaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perpustakaan.model.Book;
import com.perpustakaan.services.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Long id) {
		return bookService.getBookById(id);
	}

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
		return bookService.updateBook(id, updatedBook);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}

	@PostMapping("/{bookId}/borrow/{userId}")
	public ResponseEntity<String> borrowBook(@PathVariable Long bookId, @PathVariable Long userId) {
		if (bookService.borrowBook(bookId, userId)) {
			return ResponseEntity.ok("Buku berhasil dipinjam.");
		} else {
			return ResponseEntity.badRequest().body("Buku tidak tersedia, sudah dipinjam, atau pengguna tidak valid.");
		}
	}

	@PostMapping("/{bookId}/return")
	public ResponseEntity<String> returnBook(@PathVariable Long bookId) {
		if (bookService.returnBook(bookId)) {
			return ResponseEntity.ok("Buku berhasil dikembalikan.");
		} else {
			return ResponseEntity.badRequest().body("Buku tidak sedang dipinjam atau tidak valid.");
		}
	}
}
