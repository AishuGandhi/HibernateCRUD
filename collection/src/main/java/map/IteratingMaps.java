package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingMaps
{

    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

    
        Map<Room,Guest> map = new HashMap<>();
        map.put(oxford, maria);
        map.put(piccadilly, john);
        
        
        Set<Entry<Room,Guest>> entrySetMap = map.entrySet();
        
        for(Entry<Room,Guest> entry:entrySetMap)
        {
            System.out.println(entry.getKey().getName()+":"+entry.getValue().getFirstName());
        }
    }
}
