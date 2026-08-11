package com.scjp.java.code;

/*Write a Program to find the second Maximum element in an array?
*/
import java.util.Arrays; 
import java.util.Optional;

public class SecondHighestArrayElement {
public static void main(String[] args) {
	int arr[] = { 12, 11, 13, 15, 10 };
	Optional<Integer> max=Arrays.stream(arr).boxed().distinct().sorted((a,b)->b-a).skip(1).findFirst();
	//System.out.println(max);
	/*
	 * Using a Single Loop (Most Efficient)
	 * 
	 * Time Complexity: O(n)
	 */
	  int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      for (int num : arr) {
          if (num > largest) {
              secondLargest = largest;
              largest = num;
          } else if (num > secondLargest && num != largest) {
              secondLargest = num;
          }
      }

      System.out.println("Largest: " + largest);
      System.out.println("Second Largest: " + secondLargest);
}
}
