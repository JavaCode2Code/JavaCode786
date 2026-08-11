package com.scjp.java.code.logics;

/*First repeated character
*/
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt="Java is not Pure Object oriented Language";
		Set<Character> set=new HashSet<>();
		Character result=srt.chars().mapToObj(c->(char)c).filter(c->!set.add(c)).findFirst().orElseThrow();
		System.out.println(result);

	}

}
