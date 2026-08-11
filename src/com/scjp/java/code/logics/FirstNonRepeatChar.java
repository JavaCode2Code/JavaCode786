package com.scjp.java.code.logics;

/*First non-repeated character
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt="Java is not Pure Object oriented Language";
		
		Map<Character,Long> map=srt.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        Optional<Character> result=map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst();
        System.out.println(result);
	}

}
