package com.scjp.java.code;


/* When numbers are given as Array int[] arr = {10,15,8,49,25,98,32};
 * 
 *  output:  {false=[11, 13, 15], true=[12, 10]}
 *  */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 15, 10 };

		Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(num -> num % 2 == 0));
		System.out.println(list);
	}

}
