package com.scjp.java.code.logics;

/*4. Duplicate characters in a string
*/

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt="Java is not Pure Object oriented Language";
		Map<Character,Long> map=srt.chars().mapToObj(c->(char)c).collect
				(Collectors.groupingBy(c->c,Collectors.counting()));
				map.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);

	}

}
