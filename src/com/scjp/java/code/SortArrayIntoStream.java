package com.scjp.java.code;

/*Write a Java 8 program to sort an array and then convert the sorted array into Stream?
*/
import java.util.Arrays;

public class SortArrayIntoStream {
	
public static void main(String[] args) {
	int [] arr= {3,2,5,6,4,7,8,9};
	Arrays.parallelSort(arr);
	
	Arrays.stream(arr).forEach(System.out::println);
	
}
}
