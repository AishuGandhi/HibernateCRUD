package com.bookApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bookApp.entity.Author;
import com.bookApp.entity.Book;
import com.bookApp.entity.BookGenre;

@Repository
public class ReadBookDao
{
    Configuration conf = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(BookGenre.class).addAnnotatedClass(Author.class);
    SessionFactory sf = conf.buildSessionFactory();
    Session session;

    public List<Book> getBooks()
    {
        session = sf.openSession();
        session.beginTransaction();
        List<Book> listBooks = new ArrayList<Book>();
        listBooks = session.createQuery("FROM book").getResultList();
        session.getTransaction().commit();
        session.close();
        return listBooks;
    }

    public List<Book> getBook(String bookName)
    {
        session = sf.openSession();
        session.beginTransaction();
        List<Book> listBooks = new ArrayList<Book>();
        listBooks = session.createQuery("FROM book where book_name like :bookName", Book.class)
                        .setParameter("bookName","%" + bookName +"%").getResultList();
        session.getTransaction().commit();
        session.close();
        return listBooks;
    }
    public List<BookGenre> getCatBooks()
    {
        session = sf.openSession();
        session.beginTransaction();
        List<BookGenre> listBooks = new ArrayList<BookGenre>();
        listBooks = session.createQuery("FROM bookCategories").getResultList();
        session.getTransaction().commit();
        session.close();
        return listBooks;
    }
    public List<BookGenre> getCatReadBook(String category)
    {
        session = sf.openSession();
        session.beginTransaction();
        List<BookGenre> listBooks = new ArrayList<BookGenre>();
        listBooks = session.createQuery("FROM book where loc_id in (select loc_id from bookCategories where genre like :genre)")
                        .setParameter("genre","%" + category + "%" ).getResultList();
        session.getTransaction().commit();
        session.close();
        return listBooks;
    }
}
