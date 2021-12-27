package filehandling;

import java.io.*;
public class FileDemo
{

    public static void main(String[] args)
    {
        try
        {
            File f = new File("FirstFile.txt");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dataOutputStream = new DataOutputStream(fos);
            dataOutputStream.writeUTF("Aishwarya Gandhi");
            System.out.println("File Data Stored");
            
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
            System.out.println("File Data Read Successfully!!!");
            
        }
        catch (IOException io)
        {
            System.out.println("Input Output Error:" + io);
        }

    }

}
