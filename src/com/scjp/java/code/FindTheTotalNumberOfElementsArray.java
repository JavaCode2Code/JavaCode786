package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, find the total number

of elements present in the list using Stream functions?

*/

public class FindTheTotalNumberOfElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 15, 10 };		
		Long count2=Arrays.stream(arr).boxed().count();
		System.out.println(count2);
	}

}
