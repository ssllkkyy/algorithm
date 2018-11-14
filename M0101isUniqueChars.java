package com.test.java;

/**һ���ַ����Ƿ��ַ�����ͬ
 * @author songlk
 *
 */
public class M0101isUniqueChars {
	public static boolean isUniqueChars(String str){
		if(str.length()>128){return false;}
		boolean [] char_set=new boolean[128];//��ʼ������
		for(int i=0;i<str.length();i++ ){//��ʼ�����ַ���
			int var=str.charAt(i);//�ó��ַ���ת��Ϊascii
			System.out.println("var="+var);
			if(char_set[var]){//֮ǰ�и���λ  ��ֱ�ӷ���true
				return false;
			}
			char_set[var]=true;//�и�������λ
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
