package com.test.java;

/**�滻�ַ���
 * @author songlk
 *
 */
public class M0104replaceSpace {
    public static char [] replaceSpace(char [] str,int length){
    	int spaceCount=0,newlenth,i;
//    ����
    	for(  i=0;i< length;i++){
    		if(str[i]==' '){
    			spaceCount++;
    		}
    	}
    	newlenth=length+spaceCount*2;//��Ϊÿ��һ���ո�  ��ԭ�л�����������������
    	str[newlenth]='\0';
    	for(i=length-1;i>=0;i--){//����ѭ��
    		if(str[i]==' '){
    			str[newlenth-1]='0';
    			str[newlenth-2]='2';
    			str[newlenth-3]='%';
    			newlenth=newlenth-3;//��ǰ�ƶ�������
    		}else{
    			str[newlenth-1]=str[i];
    			newlenth=newlenth-1;//��ǰ�ƶ�һ��
    		}
    	}
    	return str;
    }
    public static void main(String[] args) {
		String s1="hello world";
		char [] c=new char[256];
		for(int j=0;j<s1.length();j++){
			c[j]=s1.charAt(j);
		}
//				s1.toCharArray();
		System.out.println("c.length="+c.length+":"+new String(c).trim());
		char[]c2=replaceSpace(c, new String(c).trim().length()  );
		
		System.out.println(new String(c2));
	}
}
