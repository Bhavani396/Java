package com.collections;

import java.util.*;

public class OtpGeneration {
	
public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println("otp number :" + r.nextInt(10000));
		
		System.out.println("password :" + "anp@"+r.nextInt(10000));

	}

}


