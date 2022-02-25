package sortingcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindingElementApplication
{
    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxford1 = new Room("Oxford", "Guest Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.0);
        
        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxford1, cambridge, victoria, oxford));
        
        rooms.sort(Room.RATE_COMPARATOR);
        
        /**
         * 1.Collection
         * 2.Object to search
         * 3.Sorting Order(Optional) else natural order will be considered
         */
        //Successful serach will return index
       int result = Collections.binarySearch(rooms, cambridge, Room.RATE_COMPARATOR);
       System.out.println("Result:"+result);
       
       //Return negative and integer will indicate where would be that element will be inserted
       Room pune = new Room("Pune", "Suite", 1, 500.0);
       System.out.println("Result:"+Collections.binarySearch(rooms, pune, Room.RATE_COMPARATOR));
       
       rooms.add(Math.abs(result),pune);
       rooms.sort(Room.RATE_COMPARATOR);
      
       System.out.println("Min:"+Collections.min(rooms,Room.RATE_COMPARATOR).getName());
       System.out.println("Max:"+Collections.max(rooms,Room.RATE_COMPARATOR).getName());
       
       System.out.format("%n%n--List Contents--%n"); 
        rooms.stream()
            .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getPrice()));
    
        
    }
    
}
