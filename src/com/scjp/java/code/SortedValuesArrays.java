package com.scjp.java.code;

/*Given a arrays of integers, sort all the values present in it using Stream functions?

*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedValuesArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//natural order or Ascending  order
		int arr[] = { 12, 11, 13, 15, 10,11,1,13,12,15 };	
		//Arrays.stream(arr).boxed().sorted().forEach(System.out::println);
		//.collect(Collectors.toList());
		//Descending  order
		Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
