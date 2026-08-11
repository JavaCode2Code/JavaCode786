package com.scjp.java.code;

/*How to find Unique elements in a given integers array in java using Stream functions?
Ouput:[13,1,12,11,1,10]
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueValueArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 11, 13, 15, 10,11,1,13,12,15 };
		List<Integer> list=Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
	System.out.println(list);
	}

}
