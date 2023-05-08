package javaDZ;

import java.util.*;
import java.util.Collections;

public class sem3_Task4 {
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        List<Integer> ArrayList = Arrays.asList(10, 12, 5, 8, 21, 16, 15);

        int n = ArrayList.size();
        int i;

        System.out.println("Элементы массива: ");

        for (i = 0; i < n; i++) {
            System.out.print(ArrayList.get(i) + " ");
        }

        System.out.println();

        Collections.sort(ArrayList);

        System.out.println("Элементы после сортировки: ");

        for (i = 0; i < n; i++) {
            System.out.print(ArrayList.get(i) + " ");
        }

        System.out.println();

        int min = ArrayList.get(0);
        int max = ArrayList.get(n - 1);
        int average = ArrayList.get(n / 2);

        System.out.println("Max: " + max); 
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
