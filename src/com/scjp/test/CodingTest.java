package com.scjp.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(1, 2, 3,4,3, 5,1,5,7,9);
		//find duplicate elements in the list using java 8 stream	
list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getKey()));
	
System.out.println("*************");
	//2nd approach using distinct and filter
   Set<Integer> set=new HashSet<>();
    list.stream().filter(n->!set.add(n)).forEach(System.out::println);
	

	//I have natural order 1 to 10 one number missing from that list how to identify that
	
	
	}
	
	
}
