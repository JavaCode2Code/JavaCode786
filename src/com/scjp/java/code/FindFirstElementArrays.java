package com.scjp.java.code;

import java.util.Arrays;

/*
Given the array of integers, find the first element of the list using Stream functions?
*/
public class FindFirstElementArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 15, 10,11,1,13,12,15 };
	       Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::println);
	}

}
