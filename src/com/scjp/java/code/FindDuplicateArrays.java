package com.scjp.java.code;

/*Gives list of all distinct/unique values 
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 15, 10,11,1,13,12,15 };
	
		Set<Integer> set = new HashSet<>();

		Arrays.stream(arr).filter(n->!set.add(n)).forEach(System.out::println);
	
	}

}
