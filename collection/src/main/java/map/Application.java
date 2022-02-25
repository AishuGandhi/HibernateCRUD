package map;

import java.util.HashMap;
import java.util.Map;

public class Application
{
    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

    
        Map<Room,Guest> map = new HashMap<>();
        map.put(oxford, maria);
        map.put(piccadilly, john);
        
        //Putting Maria in John's room by removing John
        //Put will return previous value for that key
        Guest guest = map.put(piccadilly, map.remove(oxford));
        //Making sure maria is out of her room and will not override existing entry
        map.putIfAbsent(oxford, guest);
        
        System.out.println("Oxford:"+map.get(new Room("Oxford","Suite",5,225.0)));
        System.out.println("Piccadilly:"+map.get(piccadilly));
                
    }
}
