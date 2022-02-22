package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInDemo
{

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        
        /*Consumer<Integer> c = new Consumer<Integer>() 
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };*/
       // Consumer<Integer> c=(Integer i)->System.out.println(i);
       // list.forEach(c);
        /*list.forEach(new Consumer<Integer>() {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        });*/
       // list.forEach(System.out::println);//call by method reference;
        list.forEach(ConsumerInDemo:: doubleIt);
    }
    public static void doubleIt(int i)
    {
        System.out.println(i*2);
    }
}

