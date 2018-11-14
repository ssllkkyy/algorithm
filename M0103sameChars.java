package com.test.java;

import java.util.Arrays;

/**两个不同的字符串    确定可以重组后相等
 * @author songlk
 *
 */
public class M0103sameChars {
	public static String resort(String s){
		char[] c=new char[256];
		c=s.toCharArray();
		//sort重新排序
		Arrays.sort(c);
		return new String (c);
	}
	public static boolean isEqual(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		//equals值相等
		return resort(s1).equals(resort(s2));
	}
	public static void main(String[] args) {
		String ss1="abcde";
		String ss2="acdeb";
		System.out.println(isEqual(ss1, ss2));
	}
}
