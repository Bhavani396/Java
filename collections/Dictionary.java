package com.collections;

import java.util.*;

public class Dictionary {

	public static void main(String argv[])
	    {
	            TreeMap hm = new TreeMap();

	//put(String key, Object value)
	            hm.put("dawn","early morning");
	            hm.put("rigid","Constant");
	            hm.put("vintage","Older");
	            hm.put("robust","Anticipating problems");
	            hm.put("boilerplate","REpeated set of code in an application");
	            
	            Scanner obj = new Scanner(System.in);
	            
	            System.out.println("Enter a word to add into Dictionary");
	            String word = obj.next();
	            System.out.println("Enter meaning of the word");
	            String meaning = obj.next();
	            
	            hm.put(word, meaning);
	            
	            System.out.println("Enter a word to find meaning");
	            word = obj.next();
	            
	            if(hm.containsKey(word))
	            {
	            	System.out.println("Meaning of the word: " + hm.get(word));
	            }
	            else
	            {
	            	System.out.println("Searching word not present in the dictionary...");
	            }
	            
	            Set s = hm.entrySet();

	            
	            Iterator it = s.iterator();

	            System.out.println("\n\nWord and Synonym present in Treeset");
	            while (it.hasNext())
	            {
	                    Map.Entry me = (Map.Entry) it.next();

	                    System.out.println(me.getKey() + "-" + me.getValue());
	                    }
	            }

	}