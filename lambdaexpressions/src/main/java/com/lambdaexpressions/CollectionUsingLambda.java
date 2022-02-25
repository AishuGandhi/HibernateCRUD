package com.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUsingLambda
{

    public static void main(String[] args)
    {
       List<String> names = Arrays.asList("Aish","Sumo","Dinesh","Pooja");
       
       Collections.sort(names);
       System.out.println(names);
       
       Collections.sort(names,(a,b)->b.compareTo(a));
       System.out.println(names);
       
       //total pages in your book collection
       Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
               "Ranson", "Riggs", 382);
       Book book2 = new Book("Harry Potter and The Sorcerers Stone",
               "JK", "Rowling", 411);
       Book book3 = new Book("The Cat in the Hat",
               "Dr", "Seuss", 45);
       
       List<Book> books = Arrays.asList(book1, book2, book3);
      System.out.println("Total:"+books.stream().collect(Collectors.summingInt(Book::getPages)));
      
      List<String> authNames = books.stream().map(book-> book.getAuthorFName()+book.getAuthorLName()).collect(Collectors.toList());
       System.out.println("List of Book Authors"+authNames);
    }

}
