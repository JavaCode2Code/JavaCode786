package com.scjp.java.code;

import java.util.ArrayList;
import java.util.List;

/*Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

Output: 
10, 8, 98, 32

*/
public class FindEvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list= new ArrayList<Integer>();
list.add(1);list.add(2);list.add(10);list.add(13);
list.stream().filter(num->num%2==0).forEach(System.out::println);
	}

}
