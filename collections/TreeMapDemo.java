package com.collections;

import java.util.*;

public class TreeMapDemo {

    public static void main(String argv[])
    {
            TreeMap hm = new TreeMap();

//put(String key, Object value)
            hm.put("sam",new Double(4500.50));
            hm.put("ram",new Double(1200.56));
            hm.put("raju",new Double(5600.25));
            hm.put("sundar",new Double(6300.75));
            hm.put("sundar",new Double(6300.75));
            
            Scanner obj = new Scanner(System.in);
            
            System.out.println("Enter employee name to find his salary");
            String name = obj.next();
            
            if(hm.containsKey(name))
            {
            	System.out.println("Salary of the employee " + hm.get(name));
            }
            else
            {
            	System.out.println("Searching key not present in Hashmap...");
            }
            
            Set s = hm.entrySet();

            Iterator it = s.iterator();

            System.out.println("EMployee record present in HashMap...");
            while (it.hasNext())
            {
                    Map.Entry me = (Map.Entry) it.next();

                    System.out.println(me.getKey() + "-" + me.getValue());
                    }
            }
}