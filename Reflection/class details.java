import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee 
{
    private int id;
    public String name;
    protected double salary;

    public void work() 
    {

    }
    private void calculateBonus() 
    {

    }
}

public class Reflection
{
    public static void main(String[] args) throws Exception 
    {
        Class<?> cls = Class.forName("Employee");

        System.out.println("Class Name: " + cls.getName());

        Field[] fields = cls.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) 
        {
            System.out.println(" * " + field.getName());
        }

        Method[] methods = cls.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) 
        {
            System.out.println(" * " + method.getName());
        }
    }
}