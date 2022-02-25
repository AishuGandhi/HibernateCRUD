package queue;

import java.util.ArrayDeque;
import java.util.Queue;

import listexamples.Guest;

public class QueueApplication {

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest bob = new Guest("Bob", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
        Guest siri = new Guest("Siri", "Doe", true); //loyalty program

       Queue<Guest> checkInQueue = new ArrayDeque<>();
       /*Will throw an error
       checkInQueue.remove();
        * */
       //behaviour changes in full queue or in empty queue
       checkInQueue.add(john);//offer
       checkInQueue.add(bob); 
       checkInQueue.add(sonia);
       checkInQueue.add(siri);
       print(checkInQueue);
       
       Guest guest = checkInQueue.remove();//poll()
       print(checkInQueue);
       System.out.println(guest);
       
       Guest guest1 = checkInQueue.element();//peek()
       print(checkInQueue);
       System.out.println(guest1);

    }

    public static void print(Queue<Guest> queue) {

        System.out.format("%n--Queue Contents--%n");

        int x = 0;
        for(Guest guest : queue) {
            System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
        }
        
        System.out.println("");
        
    }
}