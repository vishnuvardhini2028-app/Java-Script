
package collection;

import java.util.ArrayList;
import java.util.List;


public class Listexample 
{
   public static void main(String[] args) 
    {
        List<Integer> list=new ArrayList<>();
        
        //add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        
        //insert at index
        list.add(3,35);
        System.out.println(list);
        
        //remove by value
        list.remove(2);
        System.out.println(list);
        
        //update element
        list.set(3,44);
        System.out.println(list);
        
        //enhanced loop
        for(int li:list)
        {
            System.out.println(li);
        }
    }
    
}
