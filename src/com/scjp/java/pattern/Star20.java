package com.scjp.java.pattern;

/*
       *
      * *
     * * *
    * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
*/

public class Star20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n - i; k > 0; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
