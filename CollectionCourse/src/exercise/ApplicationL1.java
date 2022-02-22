package exercise;

import java.util.*;

public class ApplicationL1
{

    public static void main(String[] args)
    {

        Room r1 = new Room("Deluxe", "Cambridge", 4, 200.00);
        Room r2 = new Room("Normal", "Pune", 2, 400.00);
        Room r3 = new Room("Normal", "Guest Room", 2, 100.00);

        Collection<Room> roomColl = Arrays.asList(r1,r2,r3);
        System.out.println(getPotentialRevenue(roomColl));

    }

    private static double getPotentialRevenue(Collection<Room> rooms)
    {
        return rooms.stream().mapToDouble(r -> r.getPrice()).sum();
    }

}
