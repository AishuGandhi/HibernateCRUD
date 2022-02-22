package collection;
//Sorting Objects Using Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo
{
   
    public static void main(String a[])
    {
     
        List<Student> studList = new ArrayList<>();
        studList.add(new Student(1, 55));
        studList.add(new Student(1, 95));
        studList.add(new Student(1, 35));
        studList.add(new Student(1, 45));
        studList.add(new Student(1, 85));
       
       /* Collections.sort(studList,(s1,s2)->{
        return s1.marks > s2.marks ?1:-1;});*/
        Collections.sort(studList);
        for(Student s : studList)
        {
            System.out.println(s);
        }
    }
}
//Implementing it to make Student Class sort by itself
class Student implements Comparable<Student>
{
    private int rollNo;
    int marks;

    public Student(int rollNo, int marks)
    {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(Student o)
    {       
        return this.marks>o.marks?1:-1;
    }

}
