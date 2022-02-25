package com.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUsingLambda
{

    public static void main(String[] args)
    {
        Arrays.asList("red","blue","yellow")
        .stream()  //Create a pipeline of 3 elements in list
        .sorted()  //To sort them
        .findFirst()  //Find first element in sorted
        .ifPresent(System.out::println); //If Present Element print it
        
        
        Stream.of("Apple","Orange","Banana","Cherry","Papaya","Chikoo")
          .filter(fruit->
              {
              System.out.println("Fruit in List:"+fruit);
              return fruit.startsWith("C");
              }
          ) //Filter fruits that starts with C Intermediation Operator
          //As soon as found result true passed to foreach and printed
          .forEach(System.out::println); //Terminal Operation
    
      List<String> collected = Stream.of("abcd","demo")
                      .map(r->r.toUpperCase())
                      .collect(Collectors.toList());
      System.out.println(collected);
    
    }

}
