package map;

import java.util.HashMap;
import java.util.Map;

public class ApplicationWithBadKey
{
    public static void main(String[] args)
    {

        RoomWithBadKey piccadilly = new RoomWithBadKey("Piccadilly", "Guest Room", 3, 125.00);
        RoomWithBadKey oxford = new RoomWithBadKey("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

        Map<RoomWithBadKey, Guest> map = new HashMap<>();
        map.put(oxford, maria);
        map.put(piccadilly, john);
        
        //Broken up the map logic by not overriding hashCode and equals
        System.out.println("Oxford:" + map.get(new RoomWithBadKey("Oxford", "Suite", 5, 225.0)));
        System.out.println("Piccadilly:" + map.get(piccadilly));
    }
}
