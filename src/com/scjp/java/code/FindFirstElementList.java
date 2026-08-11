package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;

/*
Given the list of integers, find the first element of the list using Stream functions?
*/
public class FindFirstElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 1, 13, 1);
		list.stream().findFirst().ifPresent(System.out::println);
	}

}
