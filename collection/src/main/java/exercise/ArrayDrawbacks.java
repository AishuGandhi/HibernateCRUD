package exercise;

public class ArrayDrawbacks
{

    public static void main(String[] args)
    {
        Room r1 = new Room("Deluxe", "Cambridge", 4, 200.00);
        Room r2 = new Room("Normal", "Pune", 2, 400.00);
        Room r3 = new Room("Normal", "Guest Room", 2, 100.00);
        Room rooms[] = new Room[2];
        rooms[1]= r1;
        rooms[2]= r2;
        
        Room moreRooms[] = new Room[4];
        System.arraycopy(rooms, 0, moreRooms, 0, rooms.length);

    }

}
