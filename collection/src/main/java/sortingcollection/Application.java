package sortingcollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application
{
    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.0);
        
        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, cambridge, victoria, oxford));
        
       //Elements are in order of insertion
        System.out.println("Name\t\tType\t\tRates");
        rooms.stream()
            .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getPrice()));
    
        //Sort elements in natural order
       // Collections.sort(rooms,Comparator.naturalOrder());
        
        rooms.sort(Comparator.naturalOrder());
        System.out.println("Sorted Rooms:");
        //Ordered in alphabetical order and room with same name are ordered by their type as per logic written in room
        rooms.stream()
        .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getPrice()));

        /**
         * User Defined Comparators
         */
        //Rooms will be sorted on the basis of Rates
        //Get the rates in reveresed order followed by Name in Revered alphabetical order followed by Type Revered alphabetical order 
        rooms.sort(Room.RATE_COMPARATOR.reversed());
        rooms.stream()
        .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getPrice()));

        
    }
}
