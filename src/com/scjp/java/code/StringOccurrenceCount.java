package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*How to find only duplicate elements with its count from the String ArrayList in Java8?
*/

public class StringOccurrenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=Arrays.asList("CC","AA","cc","DD","AA","BB","DD");
		//Map<String,Long> count=name.stream().filter(x->Collections.frequency(name, x)>1).
		//collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 
		//or second ways
		Map<String,Long> count=name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(count);

	}

}
