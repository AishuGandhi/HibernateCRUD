package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMethod
{

    public static void main(String[] args)
    {
       List<Integer> values = Arrays.asList(1,2,3,4,5,6);
       
       BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

        @Override
        public Integer apply(Integer t, Integer u)
        {
            return t+u;
        }
           
    };
       
       
       //Function<Integer,Integer> 1st is Method Parameter and 2nd is Return value in generics
       Function<Integer,Integer> f = new Function<Integer,Integer>()
       {

        @Override
        public Integer apply(Integer t)
        {        
            return t*2;
        }
           
       };
       Stream s = values.stream();//Convert all the values to stream
       Stream s1 = s.map(f);//all values from stream will be multiplied by 2
       //after mapping result 
       /*2
       4
       6
       8
       10
       12*/
      
       //Sum 
      // s1.forEach(System.out::println);
       Integer result = (Integer)s1.reduce(0,b);
       System.out.println(result);
       //System.out.println(values.stream().map(i->i*2).reduce(0,(c,e) -> c+e));

    }

}
