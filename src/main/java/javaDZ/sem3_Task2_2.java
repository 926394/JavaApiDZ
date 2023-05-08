package javaDZ;

import java.util.ArrayList;
import java.util.List;
public class sem3_Task2_2 {
    public static void main(String[] args) {
        List<sem3_Task2> bigSum = GetBigSum();
        double temp = 0;
        String names = "";
        for (sem3_Task2 bigSums : bigSum) {
            if (bigSums.variety.endsWith("первый")) {
                if (bigSums.price > temp) {
                    temp = bigSums.price;
                }
            }
        }
        for (sem3_Task2 bigSums : bigSum) {
            if (bigSums.variety.endsWith("первый")) {
                if (bigSums.price < temp) {
                    names += bigSums.name;
                    names += " ";
                }
            }
        }
        System.out.println(names);
    }
    public static List<sem3_Task2> GetBigSum() {
        List<sem3_Task2> bigSum = new ArrayList<sem3_Task2>();
        bigSum.add(new sem3_Task2("Свинина_шейка", "Россия", 1, 525, "высший"));
        bigSum.add(new sem3_Task2("Говядина_шейка", "Белоруссия", 1, 450, "первый"));
        bigSum.add(new sem3_Task2("Баранина_корейка", "Казахстан", 1, 700, "первый"));
        bigSum.add(new sem3_Task2("Иван-чай", "Россия", 1, 4000, "высший"));
        bigSum.add(new sem3_Task2("Макаронные_изделия", "Китай", 1, 90, "первый"));
        bigSum.add(new sem3_Task2("Яблоки", "Молдова", 1, 119, "голден"));
        return bigSum;
    }
}

