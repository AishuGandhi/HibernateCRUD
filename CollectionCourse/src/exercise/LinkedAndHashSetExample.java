package exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedAndHashSetExample
{
    public static void main(String[] args) 
    {
       
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);
        
        //HashSet doesn't gurantee order
        Set<Room> roomSet = new HashSet<>();
        roomSet.add(piccadilly);
        roomSet.add(oxford);
        roomSet.add(oxford);
        roomSet.add(oxfordDuplicate);
        roomSet.add(victoria);
        System.out.println("HashSet");
        roomSet.stream().forEach(room->System.out.println(room.getName()));
        System.out.println();
        //Only 1 instance of oxford as all 3 has same values and we have overridden equals in room for value comparison
  
    
        Set<Room> roomLinkedSet = new LinkedHashSet<>();
        roomLinkedSet.add(piccadilly);
        roomLinkedSet.add(oxford);
        roomLinkedSet.add(oxford);
        roomLinkedSet.add(oxfordDuplicate);
        roomLinkedSet.add(victoria);
        
        System.out.println("Linked HashSet");
        roomLinkedSet.stream().forEach(room->System.out.println(room.getName()));
        
        //Unmodifiable set for thread safety and performance
        Set<Room> otherRooms = Set.of(piccadilly,oxford);
       // otherRooms.add(oxfordDuplicate);
    
       //Unmodifiable copy of Collection
        Set<Room> moreRooms = Set.copyOf(roomLinkedSet);
       // moreRooms.add(oxford);
    }

}
