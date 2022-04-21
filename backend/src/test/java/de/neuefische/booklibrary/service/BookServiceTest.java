package de.neuefische.booklibrary.service;

import de.neuefische.booklibrary.model.Book;
import de.neuefische.booklibrary.repository.BookRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void addBook() {
        // GIVEN
        BookRepository repo = mock(BookRepository.class);
        BookService service = new BookService(repo);
        Book book = new Book("1234", "Harry Potter 7");

        // WHEN
        when(repo.addBook(book)).thenReturn(book);

        // THEN
        assertEquals(book, service.addBook(book));
        verify(repo).addBook(book);
    }

    @Test
    void getAllBooks() {
    }

    @Test
    void getBookByIsbn() {
    }

    @Test
    void deleteBookByIsbn() {
    }
}