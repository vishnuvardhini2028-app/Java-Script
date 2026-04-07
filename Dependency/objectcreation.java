package com.example.dependency;

import java.lang.reflect.Field;


public class objectcreation 
{
   public static void inject(Object obj) throws Exception
   {
      Field[] fld= obj.getClass().getDeclaredFields();
      for(Field fi:fld)
      {
        if(fi.isAnnotationPresent(Inject.class))
        {
            Object ob=fi.getType().getDeclaredConstructor().newInstance();
            fi.setAccessible(true);
            fi.set(obj, ob);
        }
        
      }

   }

}

   
