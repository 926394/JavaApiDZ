package javaDZ1;


//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class task4subsequenceN {
    public static void main(String[] args) {

        System.out.println(primeNumbers("1 2 3 4 5 6 7 8 9 10"));
    }

    private static boolean primeNumbers(String str) {
        String[] strNums = str.split(" ");

        for (int i = 1; i < strNums.length; i++) {
            int number = Integer.parseInt(strNums[i]);
            int prev = Integer.parseInt(strNums[i - 1]);
            if (number < prev) {
                return false;
            } else return true;
        }

        return false;
    }
}