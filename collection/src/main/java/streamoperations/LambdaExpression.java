package streamoperations;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpression
{

    public static void main(String a[])
    {
        
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);
        
        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);
       
        //stream() in order to start pipeline
        rooms.stream().
        filter(room -> room.isPetFriendly())
        .forEach( t->System.out.println(t.getName()));
        
        rooms.stream().
        filter(Room::isPetFriendly)
        .forEach( t->System.out.println(t.getName()));
      
    }
}
