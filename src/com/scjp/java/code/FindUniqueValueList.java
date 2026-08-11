package com.scjp.java.code;

/*How to find Unique elements in a given integers List in java using Stream functions?
Ouput:[13,1,12,11,1,10]
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 1, 13, 1);
		
		
		/* Way 1 - Gives list of all distinct/unique values */
		
		
		//list.stream().distinct().forEach(System.out::println);
		
		/* Way 2 - Gives list of all distinct/unique values */
		
		Set<Integer> set=new HashSet<>(list);
	List<Integer>liset=	set.stream().collect(Collectors.toList());
		System.out.println(liset);
		//int arr[] = { 12, 11, 13, 15, 10,11,1,13,12,15 };
	}

}
