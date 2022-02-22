package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDemo
{
    public static void main(String[] args)
    {
      Map<Integer,String> map = new HashMap<>();
      map.put(1, "Aishwarya");
      map.put(2, "Sush");
      map.put(3, "Medisaa");
      System.out.println(map);
      System.out.println(map.get(1));
      
      Map<String,String> map1 = new HashMap<>();
      map1.put("Gandhi", "Aishwarya");
      map1.put("Phade", "Sush");
      map1.put("Dasa", "Medisaa");
      //map1.put("Gandhi", "Demo");//Replace Aishwarya with Demo So Cannot repeat values no keys can be repeated
      System.out.println(map1);
      Set<String> setStrings = map1.keySet();
      for(String s:setStrings)
      {
          System.out.println(map1.get(s));
      }
      
      Set<Map.Entry<Integer,String>> values = map.entrySet();
      for(Map.Entry<Integer, String> entry:values)
      {
          System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
      }
    }  
}
