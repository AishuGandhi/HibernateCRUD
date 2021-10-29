//package javabasics;

public class ToStringDemo {

	public static void main(String[] args) {
	
        Student stud = new Student(11, "Aishwarya");
        System.out.println(stud.rollNo);
        System.out.println(stud.name);
        //Prints a reference
        System.out.print(stud);
	}

}

class Student
{
	
  int rollNo;
  String name;
   
  public Student(int rollNo, String name) 
  {
		this.rollNo = rollNo;
		this.name = name;
	}
  @Override
  public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
 }
}