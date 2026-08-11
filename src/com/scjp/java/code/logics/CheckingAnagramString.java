package com.scjp.java.code.logics;

/*Check if two strings are anagrams
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

  Note: string s & t contains only lowercase letter.



Example 1:
s = "anagram",
t = "nagaram"

Output: true



Example 2:
s = "rat",
t = "car"

Output: false
*/
public class CheckingAnagramString {
public static boolean isAnagram (String s,String t) {
	if(s.length()!=t.length()) {
		return false;
	}
	int[] counter=new int[26];
	for(int i=0;i<s.length();i++) {
		counter[s.charAt(i)-'a']++;
		counter[t.charAt(i)-'a']--;
	}
	for(int count:counter) {
		if(count>0) {
			return false;
		}
	}
	return true;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram", "nagaram"));
		

	}

}
