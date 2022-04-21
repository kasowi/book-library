package de.neuefische.booklibrary.repository;

import de.neuefische.booklibrary.model.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
// Klasse wird geöffnet
public class BookRepository {

    // HashMap wird initialisiert (Initialisierung bedeutet mit Gleichzeichen)
    Map<String, Book> bookRepository = new HashMap<>();

    // Konstruktor
    public BookRepository() {

    }

    // Klassen-Methoden YAY. Wir starten mit Add!
    public Book addBook(Book book) {
        bookRepository.put(book.getIsbn(), book);
        return book;
    }

    // getAllBooks -- mache aus einer Map eine Liste YAY
    public List<Collection<Book>> getAllBooks() {
        return List.of(bookRepository.values());
    }

    // getBookByIsbn
    public Book getBookByIsbn(String isbn) {
        return bookRepository.get(isbn);
    }

    // deleteBookByIsbn
    public Book deleteBookByIsbn(String isbn) {
        return bookRepository.remove(isbn);
    }





}
