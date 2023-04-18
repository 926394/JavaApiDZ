package javaDZ1;

import java.util.Scanner;

public class task2intJava {
        public static void main(String[] args) {
            System.out.print("Введите число: \n");
            Scanner scan = new Scanner(System.in);
            System.out.println(countDiff(scan));
        }
        /**
         * @param n кол-во чисел
         * @return кол-во поло-ных чисел идущих перед отриц.
         */
        public static int countDiff(Scanner scan) {
            int a = scan.nextInt();
            int sum = 0;
            while (a != 0) {
                int b = scan.nextInt();
                if (a > 0 && b < 0) sum += a;
                a = b;
            }return sum;
        }
    }

