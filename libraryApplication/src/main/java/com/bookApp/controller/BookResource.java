package com.bookApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bookApp.dao.ReadBookDao;
import com.bookApp.entity.Book;
import com.bookApp.entity.BookGenre;

@RestController
public class BookResource
{
    @Autowired
    ReadBookDao _daoBook;

    @GetMapping("books")
    public List<Book> getBooks()
    {

        return _daoBook.getBooks();
    }

    @GetMapping("book/{bookName}")
    public List<Book> getBook(@PathVariable String bookName)
    {     
        return _daoBook.getBook(bookName);
    }
    
    @GetMapping("categories")
    public List<BookGenre> getBookCatList()
    {
        return _daoBook.getCatBooks();
    }
    
    @GetMapping("books/{category}")
    public List<BookGenre> getBookOnCategory(@PathVariable String category)
    {
        return _daoBook.getCatReadBook(category);
    }

}
