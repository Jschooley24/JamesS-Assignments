package com.james.book.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.book.models.Book;
import com.james.book.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	//returns all the books
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	//creates a book
	public Book creatBook(Book b) {
		return bookRepository.save(b);
	}
	//retrieves a book
	public Book findBook(Long id) {
		optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
	}
	//delete
	public Book deleteBook(Book id) {
		return bookRepository.save(id);
	}
	//update
	public Book updateBook(Book id) {
		return bookRepository.save(id);
	}

}
