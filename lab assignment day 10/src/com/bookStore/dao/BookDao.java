package com.bookStore.dao;

import java.util.List;

import com.bookStore.entities.Book;

public interface BookDao {
    public List<Book> getAllBooks();
    public Book getBookById(int id);
    public Book addBook(Book book);
    public void deleteBook(int id);
    public void updateBook(int id, Book book);
    public Book getBookByIsbn(String isbn);
}
