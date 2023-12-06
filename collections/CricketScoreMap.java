package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketScoreMap {

    public static void main(String[] args) {
        
    	Map<String, Integer> cricketScores = new HashMap<>();

        // Adding cricketer names and scores to the map
        
    	cricketScores.put("Virat", 120);
        cricketScores.put("Rohit", 90);
        cricketScores.put("Dhoni", 50);
        cricketScores.put("Warner", 75);
        cricketScores.put("Jadeja", 110);

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter batsman name to find his score:");
        String batsmanName = obj.next();

        if (cricketScores.containsKey(batsmanName)) {
            
        	System.out.println("Score of " + batsmanName + ": " + cricketScores.get(batsmanName));
        } 
        else {
            
        	System.out.println("Batsman not found in the scores map.");
        }
    }
}