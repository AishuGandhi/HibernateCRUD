package ObjectSerialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

//Save the object in File and while deserializing if you change the structure of Class to avoid error use XML format
//In other machine you can access same object and transfer file over a network
public class SerializableXML
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setName("Aishwarya");

        Student s2 = new Student();
        s2.setRollNo(2);
        s2.setName("Navin");

        List<Student> studList = new ArrayList<>();
        studList.add(s1);
        studList.add(s2);

        College col = new College();
        col.setStudent(studList);

        try
        {
            XMLEncoder xEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("College.xml")));
            xEncoder.writeObject(col);
            xEncoder.close();
            System.out.println("Object serialized successfully!!!");
        }
        catch (Exception e)
        {
           System.out.println(e);
        }
    }

}
