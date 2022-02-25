package sortingcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BookingService
{
    private Map<Room, Guest> bookings = new HashMap<>();

    public boolean book(Room room, Guest guest) {

        /*
         * 1. The provided Guest is placed in the bookings Map and
         * associated with the provided room, only if no other guest
         * is associated with the room.
         * 
         * Returns a boolean that indicates if the Guest was
         * successfully placed in the room.
         */
                
        return this.bookings.putIfAbsent(room, guest) == null;
    }

    public double totalRevenue() {
        
        /*
         * 2. Returns a double that totals the rate of each Room booked
         * in the bookings Map.
         */
        double revenue = 0.0;
        for(Entry<Room,Guest> entry : this.bookings.entrySet())
        {
            revenue += entry.getKey().getPrice();
        }

        return revenue;
        /*
         * or 
         *   return this.bookings.keySet().stream().mapToDouble(Room::getPrice).sum();
         */
      
    }
    
    public Map<Room, Guest> getBookings() {
        return bookings;
    }
}
