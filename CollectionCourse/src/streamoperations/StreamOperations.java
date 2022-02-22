package streamoperations;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamOperations
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
        
        Iterator<Room> iterator = rooms.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            
            if(room.isPetFriendly()) {
                System.out.println(room.getName());
            }
            
        }
        //stream() in order to start pipeline
        rooms.stream().
        filter(new Predicate<Room>() {

            @Override
            public boolean test(Room room)
            {
               System.out.format("Testing %s with result %b%n",room.getName(),room.isPetFriendly());
                return room.isPetFriendly();
            }
            //As Petfriendly true it passed to further processing
        }).forEach(new Consumer<Room>() {

            @Override
            public void accept(Room t)
            {
              System.out.println(t.getName());
            }
            
        });
       // rooms.stream()
         //   .forEach(r -> System.out.println(r.getName()));
    }
}
