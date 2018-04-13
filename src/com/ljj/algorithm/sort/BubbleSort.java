package com.ljj.algorithm.sort;

public class BubbleSort {

	public static void main(String[] args) {
		//待排序数组
		int[] array = {99,45,101,2,36,55,4,88,898};
		System.out.println("排序前数组: ");
		//输出排序前数组
		printArray(array);
        
		//排序后数组
		int[] sortArray = sort(array);
		System.out.println("排序后数组: ");
		//输出排序后数组
		printArray(sortArray);
	}

	/**
	 * 冒泡排序
	 * @Title: sort  
	 * @param array
	 * @return int[]
	 * @throws
	 */
	public static int[] sort(int[] array) {
		int isChange = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i -1; j++) {
				
			}
		}
		return null;
	}
	
	/**
	 * 打印数组
	 * @Title: printArray  
	 * @param array
	 * @throws
	 */
	public static void printArray(int[] array) {
		for (int i : array) {
			if(i == array.length - 1) {
				System.out.print(i);
			}else {
				System.out.print(i + ",");
			}
		}
	}
}
