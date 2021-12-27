package ObjectSerialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serialization saving a state of Object in File
public class ObjectSerialization
{

    public static void main(String[] args) throws ClassNotFoundException
    {
        try
        {
            Save s = new Save();
            s.i = 6;
            File f = new File("ObjectS.txt");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            System.out.println("Object Stored");
            
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Save save = (Save)ois.readObject();
            System.out.println(save);
            System.out.println("Object Read");
        }
        catch (IOException io)
        {
            System.out.println("Input Output Error:" + io);
        }

    }
}
//To avoid direct saving of Object use Marker Interface to give permission to serialize
class Save implements Serializable
{
    int i;

    @Override
    public String toString()
    {
        return "Save [i=" + i + "]";
    }
    
}
