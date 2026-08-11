package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, find the total number

of elements present in the list using Stream functions?

*/

public class FindTheTotalNumberOfElementsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 1, 13, 1);
		Long count2=list.stream().count();
		System.out.println(count2);
	}

}
