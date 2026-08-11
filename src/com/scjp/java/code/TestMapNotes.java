package com.scjp.java.code;

/*How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapNotes {
	public static void main(String[] args) {
		List<Notes> noteList = Arrays.asList(new Notes("Notes1: ", 22L)
				, new Notes("Notes2: ", 33L),
				new Notes("Notes3: ", 44L), 
				new Notes("Notes4: ", 55L), 
				new Notes("Notes5:", 77L),
				new Notes("Notes3: ", 11L), //
			
				new Notes("Notes6: ", 66L));
	Map<String,Long> mapRecord=noteList.stream().sorted(Comparator.comparingLong(Notes::getTagId).reversed())
			//// consider old value 44 for duplicate key
			// it keeps order
	.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId,(oldvalue,newValue)-> oldvalue,LinkedHashMap::new));
	System.out.println(mapRecord);

	}

}
