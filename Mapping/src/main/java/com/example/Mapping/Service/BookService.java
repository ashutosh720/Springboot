package com.example.Mapping.Service;

import com.example.Mapping.Entity.Book;
import com.example.Mapping.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(String id) {
        return bookRepository.findById(id).get();
    }

    public Book updateBook(String id, Book newBook) {
        Book book = bookRepository.findById(id).get();
        book.setTitle(newBook.getTitle());
        book.setAuthor(newBook.getAuthor());
        book.setDescription(newBook.getDescription());
        book.setPrice(newBook.getPrice());
        book.setStudent(newBook.getStudent());
        return bookRepository.save(book);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
