package com.scjp.java.code;


/*Grouping element of String
 * 
 * outPut: {a=[apple, apricot], b=[banana, blueberry], c=[cherry]}
 * */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("apple", "banana", "apricot", "cherry", "blueberry");
		Map<Character,List<String>> map=words.stream().
				collect(Collectors.groupingBy(word->word.charAt(0)));
		System.out.println(map);
	}

}
