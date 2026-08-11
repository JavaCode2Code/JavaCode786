package com.scjp.java.code;

/*Given a list of integers, sort all the values present in it using Stream functions?
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedValuesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 1, 13, 1);
		//Ascending order
		//list.stream().sorted().forEach(System.out::println);
		//Descending order
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
