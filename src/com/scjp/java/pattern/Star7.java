package com.scjp.java.pattern;



/*
 * * * * * * * * * *
 * * * * * * * * *
 * * * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Star7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
