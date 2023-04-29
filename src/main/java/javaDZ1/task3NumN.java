package javaDZ1;
//1) Дана последовательность N целых чисел. Найти сумму простых чисел.

public class task3NumN {
    public static void main(String[] args) {
        System.out.println(primeNumbers("2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31"));
    }

    private static int primeNumbers(String str) {
        String[] strNums = str.split(" ");
        int result = 0;

        for (int i = 0; i < strNums.length; i++) {
            int num = Integer.parseInt(strNums[i]);
            if (num == 2 || num == 3 || num == 5) {
                result += num;
            }
            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            } else result += num;
        }
        return result;
    }
}