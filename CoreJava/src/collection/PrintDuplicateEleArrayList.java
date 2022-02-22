package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateEleArrayList
{
    public static void main(String a[])
    {
        ArrayList<String> persons = new ArrayList<>();
        persons.add("Aishwarya");
        persons.add("Sushmita");
        persons.add("Aishwarya");
        persons.add("Sushmita");
        persons.add("Pooja");
        
        Set<String> person1 = new HashSet<>();
        //Print only duplicate values
        for(String name:persons)
        {
            if(person1.add(name)==false)
            {
                System.out.println(name);
            }
        }
    }

}
