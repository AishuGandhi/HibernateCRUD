package reflectionapiprivatemethod;

import java.lang.reflect.Method;

import objectserialization.Student;

/**
 * 
 * Reflection API for Testing and Understanding a class, not used for normal behavior used for debugging
 * 
 * @author u724611
 * @version 1.0
 * @since Dec 30, 2021 4:34:02 PM
 */
public class Test
{

    public static void main(String[] args) throws Exception
    {
        Class c = Class.forName("objectserialization.Student");
        Student s = (Student)c.newInstance();
        s.show();
       
        Method m = c.getDeclaredMethod("display", null);//null is for passing   Method Parameters if any
        m.setAccessible(true);
        m.invoke(s, null);
        
    }

}
