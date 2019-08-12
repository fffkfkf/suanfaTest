import java.util.Arrays;
/*
快速排序是将分治法运用到排序问题中的一个典型例子，快速排序的基本思想是：通过
一个枢轴（pivot）元素将 n 个元素的序列分为左、右两个子序列 Ll 和 Lr，其中子序列 Ll
中的元素均比枢轴元素小，而子序列 Lr 中的元素均比枢轴元素大，然后对左、右子序列分
别进行快速排序，在将左、右子序列排好序后，则整个序列有序，而对左右子序列的排序过
程直到子序列中只包含一个元素时结束，此时左、右子序列由于只包含一个元素则自然有序。
用分治法的三个步骤来描述快速排序的过程如下：
4. 划分步骤：通过枢轴元素 x 将序列一分为二， 且左子序列的元素均小于 x，右子
序列的元素均大于 x；
5. 治理步骤：递归的对左、右子序列排序；
6. 组合步骤：无
从上面快速排序算法的描述中我们看到，快速排序算法的实现依赖于按照枢轴元素 x
对待排序序列进行划分的过程。
对待排序序列进行划分的做法是：使用两个指针 low 和 high 分别指向待划分序列 r 的
范围，取 low 所指元素为枢轴，即 pivot = r[low]。划分首先从 high 所指位置的元素起向前
逐一搜索到第一个比 pivot 小的元素，并将其设置到 low 所指的位置；然后从 low 所指位置
的元素起向后逐一搜索到第一个比 pivot 大的元素，并将其设置到 high 所指的位置；不断重
复上述两步直到 low = high 为止，最后将 pivot 设置到 low 与 high 共同指向的位置。
使用上述划分方法即可将待排序序列按枢轴元素 pivot 分成两个子序列，当然 pivot 的
选择不一定必须是 r[low]，而可以是 r[low..high]之间的任何数据元素。图 9-4 说明了一次划
分的过程。
* */


//快速排序
public class MyQickSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 1};
        qicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void qicksort(int[] arr, int low, int height) {

        if (low < height) {
            int a = patition(arr, low, height);
            qicksort(arr, low, a - 1);
            qicksort(arr, a + 1, height);

        }
    }

    //划分区间,取出连个指针相遇的位置
    private static int patition(int[] arr, int low, int height) {

        int privot = arr[low];

        while (low < height) {

            while (low < height && privot <= arr[height]) {
                height--;
            }
            arr[low] = arr[height];
            while (low < height && privot >= arr[low]) {
                low++;
            }
            arr[height] = arr[low];
        }
        arr[low] = privot;
        return low;

    }
}
