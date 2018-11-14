package com.test.java;

import java.util.Arrays;

public class Code_04_QuickSort {
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
//		quickSort(arr, 0, arr.length - 1);
		sort2(arr,0,arr.length-1);
	}
	
	
	public static void swap3(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public static void  sort2(int[]arr,int low,int high){
        int key=arr[low];
		int start=low;
		int end=high;
		while(start<end){
			while(start<end&&arr[end]>=key){
				end--;
			}
			if(arr[end]<=key){
				swap3(arr ,start,end);
			};
			while(start<end&&arr[start]<=key){
				start++;
			}
			if(arr[start]>=key){
				swap3(arr ,start,end);
			};
		}
		if(start>low)sort2(arr,low,start-1);
		if(end<high)sort2(arr,end+1,high);
		
		
		
		
		
//		  int start = low;
//        int end = high;
//        int key =  arr[low] ;
//        while(end>start){
//            //从后往前比较
//            while(end>start&&arr[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
//                end--;
//            if(arr[end]<=key){
//                int temp = arr[end];
//                arr[end] = arr[start];
//                arr[start] = temp;
////            	swap(arr[start],arr[end]);
//            }
//            //从前往后比较
//            while(end>start&&arr[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
//               start++;
//            if(arr[start]>=key){
//              int temp = arr[end];
//              arr[end] = arr[start];
//              arr[start] = temp;
////            	swap(arr[start],arr[end]);
//            }
//        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
//        }
//        //递归
//        if(start>low) sort(arr,low,start-1);//左边序列。第一个索引位置到关键值索引-1
//        if(end<high) sort(arr,end+1,high);//
		 
	}
	
	public static void swap(int a,int b){
		int temp = a ;
        a  =b;
        b = temp;		
	}
	
	
	
    /**
     * @param a     输入数组
     * @param low   起始位置
     * @param high  终点位置
     */
    public static void sort(int[] a,int low,int high){
    	 int start = low;
         int end = high;
         int key = a[low];
         while(end>start){
             //从后往前比较
             while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                 end--;
             if(a[end]<=key){
                 int temp = a[end];
                 a[end] = a[start];
                 a[start] = temp;
             }
             //从前往后比较
             while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
             if(a[start]>=key){
                 int temp = a[start];
                 a[start] = a[end];
                 a[end] = temp;
             }
         //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
         }
         //递归
         if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
         if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
     }
   
	public static void quickSort(int[] arr, int l, int r) {
		if (l < r) {
			swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
			int[] p = partition(arr, l, r);
			quickSort(arr, l, p[0] - 1);
			quickSort(arr, p[1] + 1, r);
		}
	}

	public static int[] partition(int[] arr, int l, int r) {
		int less = l - 1;
		int more = r;
		while (l < more) {
			if (arr[l] < arr[r]) {
				swap(arr, ++less, l++);
			} else if (arr[l] > arr[r]) {
				swap(arr, --more, l);
			} else {
				l++;
			}
		}
		swap(arr, more, r);
		return new int[] { less + 1, more };
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

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
			quickSort(arr1);
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
		quickSort(arr);
		printArray(arr);

	}
}
