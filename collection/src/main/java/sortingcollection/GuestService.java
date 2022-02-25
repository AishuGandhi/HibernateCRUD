package sortingcollection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import exercise.Room;

public class GuestService {

    private List<Guest> checkinList = new ArrayList<>(100);

    public static List<Guest> filterByFavoriteRoom(List<Guest> guests, Room room) {

        /*
         *  1. Returns a new collection that contains guests from the provided collection
         *  who have indicated the provided room as the first preference in their preferred
         *  room list. 
         */

      return  guests.stream()
                      .filter(g->g.getPreferredRooms().indexOf(room)==0)
                      .collect(Collectors.toList());
  
    }

    public void checkIn(Guest guest) {
        
        /*
         *  2. Adds a guest to the checkinList, placing members of the loyalty program
         *  ahead of those guests not in the program. Otherwise, guests are arranged in the
         *  order they were inserted.
         */
       if(guest.isLoyaltyProgramMember() && !checkinList.isEmpty())
       {
           int i=0;
           for(;i<this.checkinList.size();i++)
           {
               if(this.checkinList.get(i).isLoyaltyProgramMember())
               {
                   continue;
               }
               break;
           }
           this.checkinList.add(i,guest);
       }
       else
       {
           this.checkinList.add(guest);
       }
    }
    
    public void swapPosition(Guest guest1, Guest guest2) {
        
        /*
         *  3.  Swaps the position of the two provided guests within the checkinList.
         *  If guests are not currently in the list no action is required.
         */ 
       if(!this.checkinList.contains(guest1) && !this.checkinList.contains(guest2))
       {
           int i1 = this.checkinList.indexOf(guest1);
           int i2 = this.checkinList.indexOf(guest2);
           if (i1 != -1 && i2 != -1)
           {
               this.checkinList.set(i1, guest2);
               this.checkinList.set(i2, guest1);
           }
       }

    }

    public List<Guest> getCheckInList() {
        return List.copyOf(this.checkinList);
    }
}