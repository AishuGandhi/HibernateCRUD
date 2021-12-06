package com.bookApp.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity(name = "bookCategories")
@Table(name = "book_loc_genre")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookGenre
{
    @Id
    @Column(name="loc_id")
    @JsonProperty(access = Access.WRITE_ONLY)
    private int loc_id;
    private String genre;
    private Timestamp last_updated;
    
    //@OneToOne(mappedBy="genre")
    //Book book;
   
    
    public int getLoc_id()
    {
        return loc_id;
    }

    public void setLoc_id(int loc_id)
    {
        this.loc_id = loc_id;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public Timestamp getLast_updated()
    {
        return last_updated;
    }

    public void setLast_updated(Timestamp last_updated)
    {
        this.last_updated = last_updated;
    }

}
