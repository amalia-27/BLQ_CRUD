package com.perpustakaan.model;

import jakarta.persistence.*;

@Entity
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private String title;
    private int publicationYear;
    private boolean isBorrowed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Book() {
		super();
	}

	public Book(Long id, String author, String title, int publicationYear, boolean isBorrowed, User user) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.publicationYear = publicationYear;
		this.isBorrowed = isBorrowed;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
    
}
