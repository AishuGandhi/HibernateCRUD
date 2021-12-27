package ObjectSerialization;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class DeserialiazableXML
{

    public static void main(String[] args)
    {
        College c;
        try
        {
            XMLDecoder xDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("College.xml")));
            c = (College)xDecoder.readObject();
            List<Student> studList = c.getStudent();
            for(Student s : studList)
            {
                System.out.println(s);
            }
            System.out.println("Object deserialized successfully!!!");
        }
        catch (Exception e)
        {
           System.out.println(e);
        }
    
    }

}
