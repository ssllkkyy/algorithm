package com.test.java;

/**一个字符串是否字符都不同
 * @author songlk
 *
 */
public class M0101isUniqueChars {
	public static boolean isUniqueChars(String str){
		if(str.length()>128){return false;}
		boolean [] char_set=new boolean[128];//初始化数组
		for(int i=0;i<str.length();i++ ){//开始遍历字符串
			int var=str.charAt(i);//拿出字符串转化为ascii
			System.out.println("var="+var);
			if(char_set[var]){//之前有个置位  就直接返回true
				return false;
			}
			char_set[var]=true;//有个数就置位
		}
		return true;
	}
	public static boolean isUniqueChars222(String str) {
		if (str.length() > 128) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	public static boolean isUniqueChars22 (String str){
		if (str.length() > 128) {
			return false;
		}
		 boolean []char_set=new boolean [128];
		 for(int i=0;i<str.length();i++){
			 int vari=str.charAt(i);
			 if(char_set[vari])
				 return false;
			 char_set[vari]=true;
		 }
		return true; 
	}
	
	public static boolean isUniqueChars2 (String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) 
				return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars22(word));
		}
	}
}
