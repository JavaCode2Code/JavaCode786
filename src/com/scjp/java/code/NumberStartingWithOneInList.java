package com.scjp.java.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of integers, find out all the numbers 
 
  starting with 1 using Stream functions?
  
  OutPut:10, 15, 11
*/
public class NumberStartingWithOneInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(10);list.add(13);
		list.stream().map(s->s+ "").
		filter(s->s.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);;
		
	}

}
