package com.scjp.java.code;

import java.security.Identity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Given an integer array nums, return true if any value appears at
least twice in the array, and return false if every element is distinct.

Output: 
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false

*/


public class RepeatedNumTwoice {
public static int repeatedNumTwice(int [] arr) {
	/*
	 * List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
	 * Set<Integer>set =new HashSet<>(list); if(set.size()==list.size()) { return
	 * false; } return true;
	 */
	//or
	 Set<Integer>set =new HashSet<>();
		//return Arrays.stream(arr).anyMatch(ar ->!set.add(ar));

	int num=	Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,Collectors.counting())).entrySet().
		stream().filter(entry->entry.getValue()>1L).map(entry->entry.getKey()).findFirst().get();

	return num;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,3};
		System.out.println(repeatedNumTwice(arr));

	}

}
