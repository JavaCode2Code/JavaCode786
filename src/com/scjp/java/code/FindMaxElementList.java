package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;

public class FindMaxElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 1, 13, 1);
		int max=list.stream().max(Integer::compare).get();
		System.out.println(max);
	}

}
