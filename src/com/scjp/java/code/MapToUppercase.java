package com.scjp.java.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*How to use map to convert object into Uppercase in Java 8?
*/
public class MapToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=Arrays.asList("ab,bb,cc,dd");
List<String> str2=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
str2.forEach(System.out:: println);
}

}
