package com.scjp.java.pattern;

/*
9 8 7 6 5 4 3 2 1
  8 7 6 5 4 3 2 1
    7 6 5 4 3 2 1
      6 5 4 3 2 1
        5 4 3 2 1
          4 3 2 1
            3 2 1
              2 1
                1
*/

public class Star16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9;
for(int i=0;i<=n;i++) {
	for(int j=0;j<i;j++) {
		System.out.print("  ");
	}
	for(int j=n-i;j>=1;j--) {
		System.out.print(j+ " ");
	}
	System.out.println();
}

	}

}
