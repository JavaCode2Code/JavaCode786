package com.scjp.java.code.logics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Counting Elements in Each Group
*/
public class CountingElementEachGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna", "Daniel");
/*
 * When using Collectors.groupingBy(), we can apply downstream collectors to
 * perform additional operations on grouped data. Downstream collectors allow us
 * to transform, count, sum, or reduce the collected elements within each group.
 * 
 * Counting Elements in Each Group If we just want to count the number of
 * elements in each group, we can use
 */
Map<Integer,Long> map=names.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
System.out.println("Word Counting : "+map);
	}

}
