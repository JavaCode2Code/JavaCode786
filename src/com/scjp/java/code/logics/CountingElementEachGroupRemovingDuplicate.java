package com.scjp.java.code.logics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingElementEachGroupRemovingDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Anna", "Daniel");
	Map<Integer,Set<String>> maps=	names.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));
	System.out.println(maps);
	}

}
