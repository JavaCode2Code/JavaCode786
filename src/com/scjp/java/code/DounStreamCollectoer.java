package com.scjp.java.code;

/*Count String Occurrence
 * Ouput:{banana=2, apple=2, blueberry=1}
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DounStreamCollectoer {
public static void main(String[] args) {
	List<String> words = List.of("apple", "banana", "apple", "banana", "blueberry");
Map<String ,Long> listStr=words.stream()
.collect(Collectors.groupingBy(str->str,Collectors.counting()));
System.out.println(listStr);
}
}
