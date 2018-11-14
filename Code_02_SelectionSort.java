package com.test.java;

import java.util.Arrays;

/**ѡ������
 * @author songlk
 *
 */
public class Code_02_SelectionSort {
	public static void selectionSort (int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		
		 for(int i=0;i<arr.length-1;i++){
			 int min=i;
			 for(int j=i+1;j<arr.length;j++){
				 if(arr[j]<arr[min]){
					 min=j;
				 }
			 }
			 swap(arr,min,i);
		 }
		
		
		
 
	}
	public static void selectionSort2 (int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {//��n������  
			int minIndex = i;//��index�ˣ�Ĭ�ϵ�i��
			for (int j = i + 1; j < arr.length; j++) {//�ӵ�i+1����ʼ�������ҵ���С����λ��
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			swap(arr, i, minIndex);//�û�Ĭ��λ������Сλ��
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
/*
 * 
 * ���������� int[] arr={5,2,8,4,9,1};

-------------------------------------------------------

��һ������ ԭʼ���ݣ�5  2  8  4  9  1

��С����1����1������λ��Ҳ����1��5����λ�ã�

��������1  2  8  4  9  5

-------------------------------------------------------

�ڶ�������

��1���������{2  8  4  9  5}���бȽϣ�2��С��

��������1  2  8  4  9  5

-------------------------------------------------------

����������

��1��2���������{8  4  9  5}���бȽϣ�4��С��8��4����

��������1  2  4  8  9  5

-------------------------------------------------------

����������

����1��2��4�������������{8  9  5}���бȽϣ�5��С��8��5����

��������1  2  4  5  9  8

-------------------------------------------------------

����������

����1��2��4��5�������������{9  8}���бȽϣ�8��С��8��9����

��������1  2  4  5  8  9
 * 
 * */
	// for test
	public static void comparator(int[] arr) {
		Arrays.sort(arr);
	}

	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		return arr;
	}

	// for test
	public static int[] copyArray(int[] arr) {
		if (arr == null) {
			return null;
		}
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}

	// for test
	public static boolean isEqual(int[] arr1, int[] arr2) {
		if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
			return false;
		}
		if (arr1 == null && arr2 == null) {
			return true;
		}
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	// for test
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// for test
	public static void main(String[] args) {
		int testTime = 10;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			selectionSort(arr1);
			comparator(arr2);
			if (!isEqual(arr1, arr2)) {
				succeed = false;
				printArray(arr1);
				printArray(arr2);
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

		int[] arr = generateRandomArray(maxSize, maxValue);
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}

}
