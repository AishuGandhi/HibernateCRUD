package listexamples;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);
        
        //List<Guest> checkinList = Arrays.asList(john,maria);
        //Declares ArrayList With Default List Size 100
        //To avoid resizing again and again
        List<Guest> checkinList = new ArrayList<>(100);
        checkinList.add(john);
        checkinList.add(maria);
        
        print(checkinList);
        
        //As she is member of loyalty program need to put before john and maria
        checkinList.add(0, sonia);
        print(checkinList);
        
        //Maria wants to be member of program knowing benefits
        checkinList.get(2).setLoyaltyProgramMember(true);
        
        //At the same time siri arrived who is member of program so both need to place before john
        checkinList.addAll(1, List.of(maria, siri));
        print(checkinList);
        
        //Maria duplicate entry needs to be removed
        checkinList.remove(checkinList.size() - 1);
        print(checkinList);
        
        //Wants to know position of John
        System.out.println(checkinList.indexOf(john));

    }

    public static void print(List<Guest> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }
        
    }
}