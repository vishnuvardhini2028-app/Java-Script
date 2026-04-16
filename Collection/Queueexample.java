
package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queueexample 
{
    public static void main(String[] args) 
    {
       Queue<Integer> queue=new LinkedList<>();
       
       //enqueue
       queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       queue.add(50);
       System.out.println(queue);
       
       //peek
        System.out.println(queue.peek());
        //poll
        System.out.println(queue.poll());
        
        //check empty
        System.out.println(queue.isEmpty());
    }
}
