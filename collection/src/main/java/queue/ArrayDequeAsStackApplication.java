package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsStackApplication
{

    public static void main(String[] args)
    {

        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("message1");
        messageStack.push("message2");
        messageStack.push("message3");
        messageStack.push("message4");
        print(messageStack);
        
        System.out.println(messageStack.peek());
        print(messageStack);
        
        System.out.println(messageStack.pop());
        print(messageStack);
        messageStack.push("message5");
        System.out.println(messageStack.peek());
    }

    public static void print(Deque<String> deque)
    {

        System.out.format("%n--Deque Contents--%n");

        int x = 0;
        for (String msg : deque)
        {
            System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)" : "");
        }

        System.out.println("");

    }
}
