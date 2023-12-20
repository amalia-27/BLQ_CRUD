package com.perpustakaan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perpustakaan.model.Book;
import com.perpustakaan.model.User;
import com.perpustakaan.repository.BookRepository;
import com.perpustakaan.repository.UserRepository;

@Service
public class BookService {

	@Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id).orElse(null);
        if (existingBook != null) {
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setPublicationYear(updatedBook.getPublicationYear());
            existingBook.setBorrowed(updatedBook.isBorrowed());
            return bookRepository.save(existingBook);
        }
        return null;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public boolean borrowBook(Long id, Long userId) {
        Book book = bookRepository.findById(id).orElse(null);
        User user = userRepository.findById(userId).orElse(null);

        if (book != null && user != null && !book.isBorrowed()) {
            book.setBorrowed(true);
            book.setUser(user);
            bookRepository.save(book);
            return true; // Buku berhasil dipinjam
        }
        return false; // Buku tidak tersedia, sudah dipinjam, atau pengguna tidak valid
    }

    public boolean returnBook(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
            book.setUser(null); // Menghapus informasi peminjam saat buku dikembalikan
            bookRepository.save(book);
            return true; // Buku berhasil dikembalikan
        }
        return false; // Buku tidak sedang dipinjam atau tidak valid
    }
}
