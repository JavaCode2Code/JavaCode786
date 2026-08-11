package com.scjp.java.code.logics;

/*Frequency of each character
*/
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenecOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Sateesh";
/*
 * Map<Character,Long>map=str.chars().mapToObj(ch->Character.toLowerCase((char)
 * ch)). collect(Collectors.groupingBy(c->c,Collectors.counting()));
 * System.out.println(map);
 */

/*
 * This is the most interview-friendly answer because it is short and
 * expressive.
 * 
 * Alternative using toMap
 */
Map<Character,Integer>maps=str.chars().mapToObj(c->(char)c).collect(Collectors.toMap(c->c,c->1, Integer::sum));
System.out.println(maps);
	}

}
