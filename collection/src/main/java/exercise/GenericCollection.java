package exercise;

import java.util.*;

public class GenericCollection
{

    public static void main(String[] args)
    {
        //Same Collection Type Different Element Type ...Raw Type Collection
        Collection<String> c = new ArrayList<>();
        c.add("Aishwarya");
        //c.add(new Room("Dream","Deluxe",10,700.00));
        
        System.out.println(c);
        Collection<Room> c1 = new ArrayList<>();
        c1.add(new Room("Dream","Deluxe",10,700.00));
        

    }

}
