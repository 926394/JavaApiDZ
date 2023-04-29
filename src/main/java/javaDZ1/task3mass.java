package javaDZ1;

//3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Arrays;

public class task3mass {
    public static void main(String []args) {
        int[] arr = new int[]{1, -2, 3, 4, 55, -6, 77};
        System.out.println(Arrays.toString(arr));
        System.out.println(sumElements(arr));
        System.out.println(Arrays.toString(arr));

    }
//
    public static int[] sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10 && arr[i] <= 99) {
                sum += i;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                arr[j] = sum;
            }
        }
        return arr;
    }
}