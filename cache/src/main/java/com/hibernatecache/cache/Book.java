package com.hibernatecache.cache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import javax.persistence.Table;

/*Entity Name will change name of Entity like class name taken as table name by default 
entity name will be taken as table name if mentioned*/
@Entity(name="Book_Table")
//To mention create table name
//@Table(name="Book_Table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Book  //POJO
{
	//For primary key
	@Id
	@Column(name="Book_Id")
	private int bookId;
	
	@Column(name="Book_Name")
	private String bookName;
	
	private BookAuthorName bookAuthorName;
	
	//To Avoid Column in Table e.g password and confirm password or CRUD operations
	//@Transient
	@Column(name="Book_Price")
	private double bookPrice;
	
	public int getBookId() 
	{
		return bookId;
	}

	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	public double getBookPrice()
	{
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	public BookAuthorName getBookAuthorName() {
		return bookAuthorName;
	}

	public void setBookAuthorName(BookAuthorName bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}

	@Override
	public String toString() {
		return "Book {Book Id=" + bookId + ", Book Name=" + bookName + ", Book Author=" +  bookAuthorName + ", Book Price="
				+ bookPrice + "}";
	}
}
