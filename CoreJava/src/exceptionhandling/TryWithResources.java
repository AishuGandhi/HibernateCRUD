package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources
{

    public static void main(String[] args) throws Exception
    {
        String str = "";
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
        finally //do not use finally just to close the resource
        {
            br.close();
        }
        //To Avoid all those create try with Resource 
        //If error gets it will close resources and event after executing program completely
        //Socket,Files,Database Resources
        try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));)
        {
            str = br.readLine();
        }

    }

}
