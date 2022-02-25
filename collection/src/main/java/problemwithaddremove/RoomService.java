package problemwithaddremove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RoomService
{

    // 1. Declare a Collection to store Room Inventory
    private Collection<Room> listRoom;

    // 2. Initialize Collection and assign it to the Room Inventory
    public RoomService()
    {

        this.listRoom = new ArrayList<>();

    }

    // 3. Return the Room Inventory
    public Collection<Room> getInventory()
    {
        return new ArrayList<>(this.listRoom);
    }

    // 4. Add a new Room to the Room Inventory using the provided parameters
    public void createRoom(String name, String type, int capacity, double rate)
    {
        this.listRoom.add(new Room(name, type, capacity, rate));
    }

    // 5. Add the Rooms provided in the Array to the Room Inventory
    public void createRooms(Room[] rooms)
    {
           this.listRoom.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room)
    {

        if (listRoom.contains(room))
        {
            listRoom.remove(room);
        }

    }

}