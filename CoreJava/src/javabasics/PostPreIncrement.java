package javabasics;

public class PostPreIncrement
{

    public static void main(String[] args)
    {
        int i = 5;
       //Increment and Assign
        System.out.println("Post Increment:"+i++);
        
        i = 5;
        System.out.println("Pre Increment"+ ++i);
        
        i = 5;
        System.out.println("Post Decrement:"+ i--);
        
       
        System.out.println("Pre Decrement:"+--i);

    }

}
