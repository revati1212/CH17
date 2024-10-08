package com.java.functions;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Elements {
	public static void main(String[] args)
	{
		List<Long> longList = new ArrayList<Long>();
		
		longList.add(92398908L);
        longList.add(652372763L);
        longList.add(7658766445L);
        longList.add(343456688L);
        longList.add(8766434345L);
        longList.add(87645586645L);
        longList.add(786564576L);
        longList.add(7545467865L);
        longList.add(8543456876L);
        longList.add(868760987L);
        
        longList.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println("Sorted in ascending order: " + longList);

        
        longList.stream()
        .sorted((refrence, ref) -> ref.compareTo(refrence))
        .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + longList);
    }

	}


