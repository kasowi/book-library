package de.neuefische.booklibrary.service;


import de.neuefische.booklibrary.model.Book;
import de.neuefische.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookService {

    // !!! Dies ist die Dependency Injection !!! (Zeilen 11-15) (name ist egal)
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Es kommen nochmal alle Klassenmethoden aus BookRepository -- Durchlauferhitzer
    // verschachtelt wie eine Matrjoschka
    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public List<Collection<Book>> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Book getBookByIsbn(String isbn) {
        return bookRepository.getBookByIsbn(isbn);
    }

    public Book deleteBookByIsbn(String isbn) {
        return bookRepository.deleteBookByIsbn(isbn);
    }

}
