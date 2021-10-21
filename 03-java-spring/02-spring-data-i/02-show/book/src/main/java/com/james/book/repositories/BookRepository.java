package com.james.book.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.james.book.models.Book;



@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	//this method retrieves all the books from the database
	List<Book> findAll ();
	//this find books with descriptions containing the search string
	List<Book> findByDescriptionContaining(String search);
	// count how many titles contain a certain string
	Long countByTitleContaining(String search);
	// deletes a book that starts with a specific title
	Long deleteByTitleStartingWith(String search);

}
