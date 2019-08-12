import java.util.Arrays;

/**
 * @author gmq
 * @date 2019/7/27
 * 版权：Copyright 2000-2001 si-tech.com.cn  All Rights Reserved.
 */
public class MyInsertSort {
    //插入排序
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 5, 9, 1, 0};
        insertSortMy(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSortMy(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }

    }

}
