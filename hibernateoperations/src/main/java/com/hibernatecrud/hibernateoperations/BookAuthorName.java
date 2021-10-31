package com.hibernatecrud.hibernateoperations;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//Embedding Book to BookAuthorName into same table
@Embeddable
public class BookAuthorName {
	
	@Column(name="Author_First_Name")
	private String fname;
	
	@Column(name="Author_Last_Name")
	private String lname;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "BookAuthorName {fname=" + fname + ", mname=" + lname + "}";
	}

}
