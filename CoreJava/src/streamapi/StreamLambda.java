package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamLambda
{

    public static void main(String[] args)
    {
       List<Integer> values = Arrays.asList(1,2,3,4,5,6);
       
     
       Stream s = values.stream();//Convert all the values to stream
       Stream s1 = s.map(new Function<Integer,Integer>()
       {
           @Override
           public Integer apply(Integer t)
           {        
               return t*2;
           }
              
          });
      // s1.forEach(System.out::println);
       Integer result = (Integer)s1.reduce(0, new BinaryOperator<Integer>() {

           @Override
           public Integer apply(Integer t, Integer u)
           {
               return t+u;
           }
              
       });
       System.out.println(result);
    }
}
