package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Created ArrayList of top 5 most populated countries
		List<String> populatedCountries = new ArrayList<String>();
		
		//Adding them in the order of one to five
		populatedCountries.add("India");
		populatedCountries.add("China");
		populatedCountries.add("United States");
		populatedCountries.add("Indonesia");
		populatedCountries.add("Pakistan");
		
		//Printing the second most populated country
		System.out.println("Top 2nd most populated country is : '"+ populatedCountries.get(1)+ "'");
		
		
		// Created HashSet for top most visited tourist attractions in the world
		Set<String> top10TouristAttractions = new HashSet<String>();
		
		top10TouristAttractions.add("Eiffel Tower (France)");
		top10TouristAttractions.add("Great Wall of China (China)");
		top10TouristAttractions.add("Machu Picchu (Peru)");
		top10TouristAttractions.add("Statue of Liberty (USA)");
		top10TouristAttractions.add("Colosseum (Italy)");
		top10TouristAttractions.add("Times Square (USA)");
		top10TouristAttractions.add("Disneyland Parks(World wide)");
		top10TouristAttractions.add("Grand Bazaar (Turkey)");
		top10TouristAttractions.add("Louvre Museum (France)");
		top10TouristAttractions.add("Taj Mahal (India)");
		
		//Printing the count of top most visited tourist attractions in the world
		System.out.println("Top most visited tourist attractions in the world count is : '" +top10TouristAttractions.size()+"'");
		
		// Created HashMap for top most populated cities and their population in the US
		Map<String,String> uSCitiesPopulation = new HashMap<String,String>();
		
		uSCitiesPopulation.put("New York", "8,335,898 residents");
		uSCitiesPopulation.put("Los Angeles", "3,822,235 residents");
		uSCitiesPopulation.put("Chicago", "2,665,039 residents");
		uSCitiesPopulation.put("Houston", "2,314,157 residents");
		uSCitiesPopulation.put("Phoenix", "1,644,409 residents");
		
		//Printing top most populated cities and their population in the US
		System.out.println(uSCitiesPopulation);
		
		//Create an array of 10 random integers and print out the sum of 3rd and 5th Value
		
		//Creating an array of 10 random integers
		
		int [] randomNumbers = new int[10];
		randomNumbers[0] = 4;
		randomNumbers[1] = 6;
		randomNumbers[2] = 9;
		randomNumbers[3] = 12;
		randomNumbers[4] = 21;
		randomNumbers[5] = 7;
		randomNumbers[6] = 32;
		randomNumbers[7] = 18;
		randomNumbers[8] = 1;
		randomNumbers[9] = 10;
		
		int sum = randomNumbers[2] + randomNumbers[4];

		System.out.println("Sum of 3rd and 5th number in the random integer array is : " + sum);
		
		 //Created LinkedList of top 5 highest crossing movies 
		List<String> top5HighestCrossMovies = new LinkedList<String>();
		
		//Adding them in the order of one to five
		top5HighestCrossMovies.add("Avatar");
		top5HighestCrossMovies.add("Avengers: Endgame");
		top5HighestCrossMovies.add("Avatar: The Way of Water");
		top5HighestCrossMovies.add("Titanic");
		top5HighestCrossMovies.add("Star Wars: Episode VII – The Force Awakens");
		
		//Printing top 3rd highest crossing movies of all time
		System.out.println("Top 3rd highest cross movie of all time is : '"+ top5HighestCrossMovies.get(2)+"'");
		
		
	
	}

}
