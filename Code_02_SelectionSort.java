package com.test.java;

import java.util.Arrays;

/**选择排序
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
		for (int i = 0; i < arr.length - 1; i++) {//共n趟排序  
			int minIndex = i;//第index趟，默认第i个
			for (int j = i + 1; j < arr.length; j++) {//从第i+1个开始遍历，找到最小数的位置
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			swap(arr, i, minIndex);//置换默认位置与最小位置
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
/*
 * 
 * 举例：数组 int[] arr={5,2,8,4,9,1};

-------------------------------------------------------

第一趟排序： 原始数据：5  2  8  4  9  1

最小数据1，把1放在首位，也就是1和5互换位置，

排序结果：1  2  8  4  9  5

-------------------------------------------------------

第二趟排序：

第1以外的数据{2  8  4  9  5}进行比较，2最小，

排序结果：1  2  8  4  9  5

-------------------------------------------------------

第三趟排序：

除1、2以外的数据{8  4  9  5}进行比较，4最小，8和4交换

排序结果：1  2  4  8  9  5

-------------------------------------------------------

第四趟排序：

除第1、2、4以外的其他数据{8  9  5}进行比较，5最小，8和5交换

排序结果：1  2  4  5  9  8

-------------------------------------------------------

第五趟排序：

除第1、2、4、5以外的其他数据{9  8}进行比较，8最小，8和9交换

排序结果：1  2  4  5  8  9
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
