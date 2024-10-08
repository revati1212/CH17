package com.java.PrimeMinister;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeMinister {
	public static void main(String[] args)
	{
		List<String> primeMinisters = new ArrayList<String>();
		
		
		primeMinisters.add("Jawaharlal Nehru");
        primeMinisters.add("Lal Bahadur Shastri");
        primeMinisters.add("Indira Gandhi");
        primeMinisters.add("Rajiv Gandhi");
        primeMinisters.add("Vishwanath Pratap Singh");
        primeMinisters.add("Chandra Shekhar");
        primeMinisters.add("P. V. Narasimha Rao");
        primeMinisters.add("Atal Bihari Vajpayee");
        primeMinisters.add("H. D. Deve Gowda");
        primeMinisters.add("I. K. Gujral");
        primeMinisters.add("Manmohan Singh");
        primeMinisters.add("Narendra Modi");
        
        primeMinisters.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted in ascending order: " +primeMinisters );
        
        
        primeMinisters.stream()
        .sorted((refrence, ref) -> ref.compareTo(refrence))
        .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " +  primeMinisters);

}
}