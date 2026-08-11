package com.scjp.java.code.logics;

/*Reverse each word in a sentence
*/
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt="Java is not Pure Object oriented Language";
		String str=Arrays.stream(srt.split(" ")).map(word->new StringBuilder(word).reverse().toString()).
		collect(Collectors.joining(" "));
		System.out.println(str);
	}

}
