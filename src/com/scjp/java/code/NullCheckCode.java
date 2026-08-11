package com.scjp.java.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/*How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
*/
public class NullCheckCode {

	public static void main(String[] args) {
		
		List<Notes> noteList = Arrays.asList(new Notes("Notes1: ", 22L)
				, new Notes("Notes2: ", 33L),
				new Notes("Notes3: ", 44L), 
				new Notes("Notes4: ", 55L), 
				new Notes("Notes5:", 77L),
				new Notes("Notes3: ", 11L), //
			
				new Notes("Notes6: ", 66L));
		// TODO Auto-generated method stub
		
		Optional.ofNullable(noteList).orElseGet(Collections::emptyList).stream().
		filter(Objects::nonNull).map(Notes::getTagName).forEach(System.out::println);
	}

}
