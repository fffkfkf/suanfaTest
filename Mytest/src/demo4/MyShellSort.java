package demo4;

import java.util.Arrays;

/**
 * 希尔排序
 * @author gmq
 * @date 2019/7/29
 * 版权：Copyright 2000-2001 si-tech.com.cn  All Rights Reserved.
 */
public class MyShellSort {

    public static void main(String[] args) {//10
        int[] r = new int[] { 3, 5, 2, 7, 8, 1, 2, 0, 4, 7 };
        System.out.println(Arrays.toString(r));
        int[] delta={5,3,1};
        int low=0;
        int high=r.length-1;
        for (int k=0;k<delta.length;k++){
            shellSort(r,low,high,delta[k]);
        }

        System.out.println(Arrays.toString(r));
    }

    private static void shellSort(int[] r, int low, int high, int deltaK) {
        for (int i=low+deltaK; i<=high; i++) {
            if ((r[i] - r[i - deltaK]) < 0) { //小于时，需将 r[i] 插入有序表
                int temp = r[i];
                int j = i - deltaK;
                for (; j >= low && (temp - r[j]) < 0; j = j - deltaK) {
                    r[j + deltaK] = r[j]; //记录后移
                }
                r[j + deltaK] = temp; //插入到正确位置
            }

        }
    }


}
