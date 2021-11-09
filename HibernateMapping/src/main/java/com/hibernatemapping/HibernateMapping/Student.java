package com.hibernatemapping.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@Column(name="RollNo")
	private int rollNo;
	
	@Column(name="S_Name")
	private String sname;
	
	@Column(name="Marks")
	private int marks;
	
	/*Will Create Lid as a foreign key in Student Table 1 Student -> 1 laptop
	 * @OneToOne
	private Laptop laptop;*/
	//To Avoid creating Student_roll no as foreign key and even if we have mapping table 
	@OneToMany(mappedBy = "student")
	private List<Laptop> laptopList = new ArrayList<Laptop>(); 

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<Laptop> getLaptopList() {
		return laptopList;
	}

	public void setLaptopList(List<Laptop> laptopList) {
		this.laptopList = laptopList;
	}

	/*public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
*/
	@Override
	public String toString() {
		return "Student {Roll No=" + rollNo + ", Student Name=" + sname + ", Marks=" + marks + "}";
	}	
}
