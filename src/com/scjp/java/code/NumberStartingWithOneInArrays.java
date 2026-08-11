package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of integers, find out all the numbers 
 
  starting with 1 using Stream functions?
  
  OutPut:10, 15, 11
*/
public class NumberStartingWithOneInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 15, 10,3,6,7,1 };
		List<String>list=Arrays.stream(arr).boxed().map(s->s+ "").
		filter(s->s.startsWith("1")).collect(Collectors.toList());;
		System.out.println(list);
		
	}

}
