package com.scjp.java.code;

/*Write a Program to find the Maximum element in an array?
*/
import java.util.Arrays;

public class MaxiamArrayElement {
public static void main(String[] args) {
	int arr[] = { 12, 11, 13, 15, 10 };
	int max=Arrays.stream(arr).max().getAsInt();
	System.out.println(max);
}
}
