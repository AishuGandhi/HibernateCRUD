package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TressSetExample
{

    public static void main(String[] args)
    {
        List<Integer> tree = Arrays.asList(100,700,40,20,60);
        
        NavigableSet<Integer> treeSet = new TreeSet<>(tree);
        
        System.out.println("First Lower of Given Number in Set");
        System.out.println(treeSet.lower(100));
        
        System.out.println("Ascending Order of Set");
        treeSet.stream().forEach(System.out::println);
        
        System.out.println("Descending Order of Set");
        treeSet.descendingSet().
        stream().   
        forEach(System.out::println);
        
        
        System.out.println("Get Elements in Tree Lower Than Particular Number");
        treeSet.headSet(100).
        stream().   
        forEach(System.out::println);
        
        System.out.println("Get Elements in Tree Higher Than Particular Number");
        treeSet.tailSet(100).
        stream().   
        forEach(System.out::println);
        
        
        System.out.println("Get Elements in Tree Between Than Given Range");
        treeSet.subSet(40,100).
        stream().   
        forEach(System.out::println);

    }

}
