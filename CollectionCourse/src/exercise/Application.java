package exercise;

public class Application
{

    public static void main(String[] args)
    {
      Room r1 = new Room("Deluxe","Cambridge",4,200.00);
      Room r2 = new Room("Normal","Pune",2,400.00);
      Room r3 = new Room("Normal","Guest Room",2,100.00);
      System.out.println(getPotentialRevenue(r1, r2,r3));
    }

    private static double getPotentialRevenue(Room room1,Room room2,Room room3)
    {
        return room1.getPrice() + room2.getPrice() + room3.getPrice();
    }
}
