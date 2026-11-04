package com.scjp.bitwise.operator;

public class BitwiseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=5; int b=3;
     System.out.println("a & b:"+(a & b)); //1(001 AND)
     System.out.println("a | b:"+(a | b)); //7(111 OR)
     System.out.println("a ^ b:"+(a ^ b)); //6(110 XOR)
     
     System.out.println("~a :"+(~a)); // -6 bitwise NOT
     
     System.out.println("a << 1:"+(a << 1)); //10(1010 left shift)
     
     System.out.println("a >> 1:"+(a >> b)); //0(0000 right shift)
     
     System.out.println("a >>> 1:"+(a >>> b)); //1(0001 unsigned right shift)
     
     
     
	}

}
