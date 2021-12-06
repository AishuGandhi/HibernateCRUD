package com.bookApp.entity;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity(name = "book")
@Table(name = "book")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book
{

    @Id
    @JsonProperty(access = Access.WRITE_ONLY)
    private int book_id;
    private String book_name;
    private int year_of_publishment;
    
    //To avoid showing in response
    @JsonProperty(access = Access.WRITE_ONLY)
    private Timestamp last_updated;
    
    @JsonProperty(access = Access.WRITE_ONLY)
    private char availability;
    
    @JsonProperty(access = Access.WRITE_ONLY)
    private char valid_flag;
    
    @JsonProperty(access = Access.WRITE_ONLY)
    private int loc_id;
    
    private int pages;

   /* @OneToOne
    @JoinColumn(name="loc_id", insertable = false, updatable = false,nullable =  false)
    private BookGenre genre;*/
    
    //Many books can have one author
    @ManyToOne
    private Author author;
    
    public int getBook_id()
    {
        return book_id;
    }

    public void setBook_id(int book_id)
    {
        this.book_id = book_id;
    }
    public String getBook_name()
    {
        return book_name;
    }

    public void setBook_name(String book_name)
    {
        this.book_name = book_name;
    }
    public int getYear_of_publishment()
    {
        return year_of_publishment;
    }

    public void setYear_of_publishment(int year_of_publishment)
    {
        this.year_of_publishment = year_of_publishment;
    }

    public Timestamp getLast_updated()
    {
        return last_updated;
    }

    public void setLast_updated(Timestamp last_updated)
    {
        this.last_updated = last_updated;
    }

    public char isAvailability()
    {
        return availability;
    }

    public void setAvailability(char availability)
    {
        this.availability = availability;
    }

    public char isValid_flag()
    {
        return valid_flag;
    }

    public void setValid_flag(char valid_flag)
    {
        this.valid_flag = valid_flag;
    }


    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public char getAvailability()
    {
        return availability;
    }

    public char getValid_flag()
    {
        return valid_flag;
    }

    public int getLoc_id()
    {
        return loc_id;
    }

    public void setLoc_id(int loc_id)
    {
        this.loc_id = loc_id;
    }
    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }
 
}
