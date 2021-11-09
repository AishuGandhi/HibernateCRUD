package com.hibernatefetch.fetch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop
{

    @Id
    @Column(name = "L_Id")
    private int lid;

    @Column(name = "L_Price")
    private int lprice;
    
    @Column(name = "L_Brand")
    private String lbrand;
    
    @ManyToOne
    private Alien alien;

    public int getLprice()
    {
        return lprice;
    }

    public void setLprice(int lprice)
    {
        this.lprice = lprice;
    }

    public String getLbrand()
    {
        return lbrand;
    }

    public void setLbrand(String lbrand)
    {
        this.lbrand = lbrand;
    }

    public int getLid()
    {
        return lid;
    }

    public void setLid(int lid)
    {
        this.lid = lid;
    }

   
    public Alien getAlien()
    {
        return alien;
    }

    public void setAlien(Alien alien)
    {
        this.alien = alien;
    }

    @Override
    public String toString()
    {
        return "Laptop [lid=" + lid + ", lprice=" + lprice + ", lbrand=" + lbrand + "]";
    }
}
