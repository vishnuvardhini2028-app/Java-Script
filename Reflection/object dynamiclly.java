import java.lang.reflect.*;

class Person 
{
    private String name;
    private int age;

    public Person() 
    {
        this.name = "Vishnu Vardhini";
        this.age = 23;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }
}

public class DynamicObject 
{
    public static void main(String[] args) throws Exception 
    {
        Class<?> cls = Class.forName("Person");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Person person = (Person) obj;
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}