package com.test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**ԭ���ַ���������
 * �ַ�������  ���ʵ���
 * @author songlk
 *
 */
 
public class M0102reverse {
//	�ַ�������
	public static String reverse2(String s) {
		  int length = s.length();
		  StringBuilder reverse = new StringBuilder("");
		  for (int i = 0; i <length; i++)
			  //���β��뵽ǰ��ı���λ��  charAtȡ��λ�õ�char�ַ�
	            reverse = reverse.insert( 0,s.charAt(i)) ;
		        return reverse.toString();
		 }
	
		 public static void main(String[] args) {
			  String o="abcdefg";
			  System.out.println("output="+reverse2(o));
			  System.out.println(""+reversChirldrenStr("hello ni hao"));
		}
//		 �ִ�����
		 public static String reversChirldrenStr(String str){
			 Stack<String> stack=new Stack<String>();
			  String[] arr= str.split(" ");
			  for (int i = 0; i < arr.length; i++) {
				  System.out.println("arr="+arr[i]);
				  stack.push(arr[i]);
				  System.out.println("stack="+stack.get(i));
			  }
			  StringBuilder sb=new StringBuilder();
			  for (int i = 0; i <arr.length; i++) {
				  sb=sb.append( stack.pop()+" ");
			}
			 return sb.toString();
		 }
}
