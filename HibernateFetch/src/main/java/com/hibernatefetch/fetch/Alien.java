package com.hibernatefetch.fetch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien {

    @Id
    @Column(name="A_Id")
    private int aid;
    
    @Column(name="A_Name")
    private String aname;
    
    @Column(name="A_Color")
    private String acolor;
    
    @OneToMany(mappedBy="alien",fetch = FetchType.EAGER)
    private List<Laptop> laps = new ArrayList<Laptop>();

    public int getAid()
    {
        return aid;
    }

    public void setAid(int aid)
    {
        this.aid = aid;
    }

    public String getAname()
    {
        return aname;
    }

    public void setAname(String aname)
    {
        this.aname = aname;
    }

    public String getAcolor()
    {
        return acolor;
    }

    public void setAcolor(String acolor)
    {
        this.acolor = acolor;
    }

    public List<Laptop> getLaps()
    {
        return laps;
    }

    public void setLaps(List<Laptop> laps)
    {
        this.laps = laps;
    }

    @Override
    public String toString()
    {
        return "Alien [Aid=" + aid + ", Aname=" + aname + ", Acolor=" + acolor + ", Laptop List=" + laps + "]";
    }
}
