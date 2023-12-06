package com.collections;

import java.util.*;

public class HashSetDemo {
	
	
public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);
		
		//display
		System.out.println(hs);
		
		//contains() usage
		System.out.println("Collection contains Element 10 :"+ hs.contains(10));
		
		//remove an element
		hs.remove(15);
		
		//display size of collection
		System.out.println("Size of collection "+ hs.size());
		
		

	}

}

	
	


