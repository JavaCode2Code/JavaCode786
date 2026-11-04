package com.scjp.bitwise.operator;

import java.math.BigInteger;

public class InstanceOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str instanceof String);
		
		Number num=new Integer(10);
		System.out.println(num instanceof Integer);
		System.out.println(num instanceof Number);
	}
}
