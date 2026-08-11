package com.scjp.java.code;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Given a String, find the first non-repeated character in it using Stream functions?
 * Output:j
*/

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Articles are Awesome";
		Character result = str.chars().mapToObj(s -> Character.toLowerCase((char) s))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		//System.out.println(result);
		/* or */
		
	char ch3=	str.chars().mapToObj(c->(char)c).filter(ch->str.indexOf(ch)==str.lastIndexOf(ch)).findFirst().orElse(null);
		
		System.out.println(ch3);
	}

}
