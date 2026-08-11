package com.scjp.java.code;

/*Write a program to print the count of each character in a String?
*/
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurrenceCount {
	public static void charOccurrenceCount(String s) {
		Map<String,Long> charC=Arrays.stream(s.split("")).collect
		(Collectors.groupingBy(str->str,LinkedHashMap::new,Collectors.counting()));
		System.out.println(charC);
	}
public static void main(String[] args) {
	charOccurrenceCount("string data to count each character");
	
}
}
