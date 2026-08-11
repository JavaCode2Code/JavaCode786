package com.scjp.java.code;

/*How to count each element/word from the String ArrayList in Java8?
*/
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountIngStringWord {
public static void main(String[] args) {
	List<String> list=Arrays.asList("CC","AA","cc","DD","AA","BB","DD");
	Map<String,Long>counting=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(counting);
	
}
}
