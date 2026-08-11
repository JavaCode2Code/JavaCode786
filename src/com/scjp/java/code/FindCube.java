package com.scjp.java.code;

/*Java 8 program to perform cube on list elements and filter numbers greater than 50.
*/

import java.util.Arrays;
import java.util.List;

public class FindCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=Arrays.asList(1,2,3,5,7,6,8);
list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
	}

}
