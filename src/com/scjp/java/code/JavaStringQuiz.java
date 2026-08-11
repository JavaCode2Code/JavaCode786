package com.scjp.java.code;

public class JavaStringQuiz {
public static void main(String[] args) {
	String str= " ";
	System.out.println("empty " +str.isEmpty());
	
	System.out.println("Blank " +str.isBlank());
	
	String s1="null"+null+1;
	
	System.out.println(s1);
	
	System.out.println("ONE"+2+3+4+"FIVE");
	
	System.out.println("A".compareTo("B"));
	
	System.out.println("B".compareTo("A"));
	
	"ABC123abc".chars().forEach(System.out::println);
	
	System.out.println("JAVA"+1000+2000+3000);
}
}
