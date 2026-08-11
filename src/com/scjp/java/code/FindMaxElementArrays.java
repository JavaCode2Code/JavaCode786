package com.scjp.java.code;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxElementArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 15, 10,11,1,13,12,15 };
		int max=Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
		System.out.println(max);
	}

}
