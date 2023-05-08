package javaDZ;
import java.util.ArrayList;
import java.util.List;
public class sem3_Task1_1 {
    public static void main(String[] args) {
        List<sem3_Task1> bigSum = GetBigSum();
        double temp = 0;
        for(sem3_Task1 bigSums: bigSum) {
            if(bigSums.variety.endsWith("высший") )
            {
                if (bigSums.price > temp) {
                    temp = bigSums.price;
                }
            }
        }
        System.out.println(temp);
    }

    public static List<sem3_Task1> GetBigSum()
    {
        List<sem3_Task1> bigSum = new ArrayList<sem3_Task1>();
        bigSum.add(new sem3_Task1("Свинина_шейка", "высший", 525));
        bigSum.add(new sem3_Task1("говядина_шейка", "первый", 400));
        bigSum.add(new sem3_Task1("баранина_корейка", "первый", 700));
        bigSum.add(new sem3_Task1("Иван-чай", "высший", 4000));
        bigSum.add(new sem3_Task1("Макаронные_изделия", "первый", 90));
        bigSum.add(new sem3_Task1("Яблоки", "голден", 119));
        return bigSum;
    }
}