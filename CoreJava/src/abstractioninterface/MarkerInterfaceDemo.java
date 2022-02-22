package abstractioninterface;
interface P
{
    }
class Demo implements P
{
    void show()
    {
        System.out.println("Heloo!!");
    }
    }
public class MarkerInterfaceDemo
{

    Demo demo = new Demo();
   //not allowed demo.show();
   /* if(demo instanceOf P)
    {
        
    }*/
}
