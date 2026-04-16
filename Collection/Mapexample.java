
package collection;

import java.util.HashMap;
import java.util.Map;


public class Mapexample 
{
    public static void main(String[] args) 
    {
        Map<Integer,String> map=new HashMap<>();
        
        //add element
        map.put(1, "apple");
        map.put(2, "orange");
        map.put(3, "mango");
        map.put(4,"grapes");
        map.put(5, "guava");
        System.out.println(map);
        
        //update element
        map.put(4, "pomegranate");
        System.out.println(map);
        
        //remove element
        map.remove(5, "guava");
        System.out.println(map);
        
        //retrieve
        System.out.println(map.get(1));
        
        //enhanced loop
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
                
    }
}
