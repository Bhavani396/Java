package com.collections;

import java.util.*;

public class VectorExample {
	
	  public static void main(String argv[])
      {
//Vector(int capacity, int increment)
              Vector v = new Vector();

              System.out.println("Capacity : " + v.capacity());
              System.out.println("Size : " + v.size());

              v.addElement("Sam");
              System.out.println("Capacity : " + v.capacity());
              System.out.println("Size : " + v.size());
              v.addElement("Ram");
              v.addElement(new Integer(10));
              v.addElement("Ravi");
             v.addElement(new Integer(15));
              v.addElement(new Integer(25));

              System.out.println("capacity : " + v.capacity());
              System.out.println("Size : " + v.size());

              v.addElement(new Integer(20));
              System.out.println("capacity : " + v.capacity());
              v.addElement(new Integer(30));
              System.out.println("capacity : " + v.capacity());

              v.insertElementAt("Raju",1);

              System.out.println("Content : " + v);

              for (int i=0;i<v.size();i++)
                      System.out.println(v.elementAt(i));

              System.out.println("Capacity : " + v.capacity());
              System.out.println("Size : " + v.size());


              v.removeElement("Sam");
              System.out.println("Content : " + v);

              v.removeElementAt(2);
              v.removeElementAt(3);
              v.removeElementAt(4);


              System.out.println("Content : " + v);
              System.out.println("First Element : " + v.firstElement());
              System.out.println("Last Element : " + v.lastElement());

              System.out.println("100 - Available : " + v.contains(new Integer(100)));

              Enumeration e = v.elements();

              while (e.hasMoreElements())
              {
                      System.out.println(e.nextElement());
                      }
System.out.println("Capacity : " + v.capacity());
System.out.println("Size : " + v.size());
              }
      


}
