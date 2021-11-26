package com.restapi.RESTCRUD;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "book")
@Table(name = "book")
public class Book
{

    @Id
    private int book_id;

    private int year_of_publishment;
    private String book_name;
    private Timestamp last_updated;
    private char availability;
    private char valid_flag;
    private int author_id;
    private int loc_id;

    public int getBook_id()
    {
        return book_id;
    }

    public void setBook_id(int book_id)
    {
        this.book_id = book_id;
    }

    public int getYear_of_publishment()
    {
        return year_of_publishment;
    }

    public void setYear_of_publishment(int year_of_publishment)
    {
        this.year_of_publishment = year_of_publishment;
    }

    public String getBook_name()
    {
        return book_name;
    }

    public void setBook_name(String book_name)
    {
        this.book_name = book_name;
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

    public int getAuth_id()
    {
        return author_id;
    }

    public void setAuth_id(int auth_id)
    {
        this.author_id = auth_id;
    }

    public int getLoc_id()
    {
        return loc_id;
    }

    public void setLoc_id(int loc_id)
    {
        this.loc_id = loc_id;
    }

}
