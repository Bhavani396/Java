package com.collections;

import java.util.*;

public class PropertyExample {
	
	 public static void main(String argv[])
     {
             Properties ht = new Properties();

             ht.put("Sam","Erode");
             ht.put("Ram","Salem");
             ht.put("Tam","banglaore");
             ht.put("Balu","Hyderabad");

             Set s = ht.keySet();

             Iterator it = s.iterator();

             while (it.hasNext())
             {
                     String key = (String) it.next();
                     String value = ht.getProperty(key);
                     System.out.println(key + "-" + value);
                     }

             System.out.println(ht.getProperty("Ram","Not Found"));
             System.out.println(ht.getProperty("Sekar","Not Found"));
             }
     }


