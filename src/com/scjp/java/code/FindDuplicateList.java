package com.scjp.java.code;

/*How to find duplicate elements in a given integers list in java using Stream functions?
Ouput:[13,1]
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 12, 11, 13, 1, 13, 1);
		Set<Integer> set = new HashSet<>();
		// list.stream().filter(n->!set.add(n)).forEach(System.out::println);
		List<Integer> list2 = list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());

		System.out.println(list2);
		
	}

}
