package streamoperations;

public class Room
{

     private String type;
     
     private String name;
     
     private int capacity;
     
     private double price;

     private boolean petFriendly;
     
    public Room(String name, String type, int capacity, double price)
    {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public boolean isPetFriendly()
    {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly)
    {
        this.petFriendly = petFriendly;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacity;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Room other = (Room) obj;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (type == null)
        {
            if (other.type != null) return false;
        }
        else if (!type.equals(other.type)) return false;
        return true;
    }
    @Override
    public String toString()
    {
        return "Room [ name=" + name +", type=" + type + ", capacity=" + capacity + ", price=" + price + ", petFriendly="
                        + petFriendly + "]";
    }
}
