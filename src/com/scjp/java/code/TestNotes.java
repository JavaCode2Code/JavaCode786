package com.scjp.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNotes {
	

	public static void main(String[] args) {
		List<Notes> notes=new ArrayList<>();
       notes.add(new Notes("Notes1",11L));
       notes.add(new Notes("Notes2",22L));
       notes.add(new Notes("Notes3",33L));
       notes.add(new Notes("Notes4",44L));
       
       notes.add(new Notes("Notes2",55L));
       notes.add(new Notes("Notes5",66L));
       
       Map<String,Long> map=notes.stream().sorted(Comparator.comparingLong(Notes::getTagId)
    		   .reversed()).collect(Collectors.
		/*
		 *  consider old value 22 for Duplicate key 
		 *   it keeps order
		 */    				   toMap(Notes::getTagName,Notes::getTagId, (oldvalue,newValue)->oldvalue,LinkedHashMap::new));
    		System.out.println("Maprecords "+map);  
			/*
			 * int[] arr = {1,3,5,3,4,2,1,8,9,5,10}; int
			 * maxInt=Arrays.stream(arr).max().getAsInt(); System.out.println("Max Int : "
			 * +maxInt);
			 * 
			 * List<Notes> noteLst = Arrays.asList(new Notes("Work"), new Notes("Personal"),
			 * null);
			 * 
			 * Optional.ofNullable(noteLst) .orElseGet(Collections::emptyList) .stream()
			 * .filter(Objects::nonNull) .map(Notes::getTagName)
			 * .forEach(System.out::println);
			 * 
			 * Optional.ofNullable(noteLst).orElseGet(Collections::emptyList).stream().
			 * filter(Objects::nonNull).map(Notes::getTagName).
			 * forEach(System.out::println);
			 */
    	
   	

			/*
			 * List<String> list5=Arrays.asList("AP","up","ep","mp","mp" ,"kr");
			 * Map<String,Long> count=list5.stream()
			 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			 * .entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.
			 * toMap(Map.Entry::getKey,Map.Entry::getValue));
			 */
	}
}
