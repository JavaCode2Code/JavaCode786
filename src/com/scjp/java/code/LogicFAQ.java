package com.scjp.java.code;

public class LogicFAQ {

	public static void faq1() {
		int x = 5;
		if (x++ > 5 && ++x > 7) {
			System.out.print(x);
		}
		System.out.print(x);
	}
//6	
	public static void faq2() {
		System.out.println("Java" +1 +2);
		System.out.println(1+2+ "Java");
	}
//Java12
	//3java
	public static void faq3() {
		int x=0;
		for(;x<5;) {
			System.out.println(x + " ");
			x=x++;
		}
	}
	//0000000 infinite
	public static void main(String[] args) {
		//faq1();
		//faq2();
		faq3();
		
	}

}
