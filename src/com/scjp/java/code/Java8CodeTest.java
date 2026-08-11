package com.scjp.java.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8CodeTest {
	
public static void main(String[] args) {
	//find even numbers in list
	List<Integer> list=Arrays.asList(12,15,11,13,11,32,77,15,32,46,77);
	
	List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
	//System.out.println(even);
	
	//Find Even from array
	int[] arr= {12,11,13,15,32,46,77};
	Map<Boolean, List<Integer>> map=Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n->n%2==0));
//	System.out.println(map);
	
	//find the number start with 1 from List
	
	//list.stream().map(s->s +"").filter(s->s.startsWith("7")).collect(Collectors.toList()).forEach(System.out::println);
// find the number start with 2 form array
	List<String> arrList=Arrays.stream(arr).boxed().map(s->s+"").filter(num->num.startsWith("1")).collect(Collectors.toList());
//System.out.println(arrList);
	//find duplicate from list
	Set<Integer>set=new HashSet<>();
	//list.stream().filter(n->!set.add(n)).forEach(System.out::println);
	
	//unique value
	 
		//	list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);;
	Set<Integer>set2=new HashSet<>(list);
	List<Integer> list2=set2.stream().collect(Collectors.toList());
			//list2.forEach(System.out::println);
			List<Integer> list3=Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
//System.out.println(list3);
			//find first element from list

			//list.stream().findFirst().ifPresent(System.out::println);
			//find first element from arrays
		//	Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::println);
			//find total number of elements
			
		long count=	list.stream().count();
		//System.out.println(count);
	long counts=	Arrays.stream(arr).boxed().count();
	//System.out.println(counts);
	
	//find max element from list
	
	int max=list.stream().max(Integer::compare).get();
	//System.out.println("max Num: "+ max);
	
	//find max element form arr
	
	int max2arr=Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
	//System.out.println("Array max Element: "+max2arr);
	
	//first non repeating character form string
	String input="Java is Most Good programing Java Lag";
			Character resut= input.chars().mapToObj(s->Character.toLowerCase
					(Character.valueOf((char)s))).collect(Collectors.
							groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
					.filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).findFirst().get();
		
		//System.out.println(resut);
			
			//way2
			Character rechar= input.chars().mapToObj(c->(char)c).filter(ch->input.indexOf(ch)==input.lastIndexOf(ch)).findFirst()
			.orElse(null);
		//	System.out.println(rechar);
		
//first repeated charater in string
			String input2="Java Articles are Awesome";	
			Character result=input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, 
					Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1L).map(entry->entry.getKey()).findFirst().get();
					System.out.println("F : "+result);
					Set<Character> sets=new HashSet();
					
					Character result2=input2.chars().mapToObj(s->(char)s).filter(c->!sets.add(c)).findFirst().orElse(null);
}
}
