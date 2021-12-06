package com.bookApp.entity;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name= "author")
public class Author
{


    @Id
    @Column(name = "author_id")
    @JsonProperty(access = Access.WRITE_ONLY)
    private int author_id;
    private String f_Name;
    private String l_Name;
    
    @JsonProperty(access = Access.WRITE_ONLY)
    private Timestamp last_updated;
    @JsonProperty(access = Access.WRITE_ONLY)
    private char valid_flag;
    
   //One Author Can Have multiple Books
    @OneToMany(mappedBy="author" ,fetch = FetchType.EAGER)
    private List<Book> book = new ArrayList<Book>();

    public int getAuthor_id()
    {
        return author_id;
    }

    public void setAuthor_id(int author_id)
    {
        this.author_id = author_id;
    }

    public String getF_Name()
    {
        return f_Name;
    }

    public void setF_Name(String f_Name)
    {
        this.f_Name = f_Name;
    }

    public String getL_Name()
    {
        return l_Name;
    }

    public void setL_Name(String l_Name)
    {
        this.l_Name = l_Name;
    }

    public Timestamp getLast_updated()
    {
        return last_updated;
    }

    public void setLast_updated(Timestamp last_updated)
    {
        this.last_updated = last_updated;
    }

    public char getValid_flag()
    {
        return valid_flag;
    }

    public void setValid_flag(char valid_flag)
    {
        this.valid_flag = valid_flag;
    }
    //Number of Book of these author
    //For more info link

    public List<Book> getBook()
    {
        return book;
    }

    public void setBook(List<Book> book)
    {
        this.book = book;
    }
}
