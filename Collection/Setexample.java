
package collection;

import java.util.HashSet;
import java.util.Set;


public class Setexample 
{
    public static void main(String[] args) 
    {
       Set<String> set=new HashSet<>();
    
    //add elements
    set.add("vishnu");
    set.add("Taj");
    set.add("Gowsalya");
    set.add("Kavi");
    set.add("Anu");
    System.out.println(set);
    
   
   System.out.println(set.contains("vishnu"));
   
   //remove element
   set.remove("Anu");
   System.out.println(set);
   
   //enhanced loop
   for(String name:set)
   {
       System.out.println(name);
   }
   
 
            
            
    }         
            
            
            
            
            
            
            
            
}
