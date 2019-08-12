package demo4;

import java.util.Arrays;
/*
* :两两比较相邻记录的关键字，如果反序则交换，直到没有反序的记录为止.
* 一般是将最小的浮上来,从小到大排序.
* */

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[] {5,7,2,9,4,1,0,5,7};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("从小到大: "+Arrays.toString(arr));
	}
	
	//冒泡排序
	/**
	 * 5,7,2,9,4,1,0,5,7		共需要比较length-1轮
	 * 5,7,2,9,4,1,0,5,7	
	 * 5,2,7,9,4,1,0,5,7
	 * 5,2,7,4,1,0,5,7,9
	 * 2,5   
	 */
	public static void bubbleSort(int[]  arr) {
		//控制共比较多少轮
		for(int i=0;i<arr.length-1;i++) {
			//控制比较的次数,每一轮都把最大的数放到最后.
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
