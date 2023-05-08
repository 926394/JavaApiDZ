package javaDZ;

import java.util.ArrayList;
import java.util.List;
public class sem3_Task3_3 {
    public static void main(String[] args) {
        List<sem3_Task3> titleList = GettitleList();
        int moj = 2010;
        for (sem3_Task3 titleLists : titleList) {
            if (titleLists.authorName.startsWith("А")) {
                    if (titleLists.earEdition >= moj) {
                        System.out.println(titleLists.nameBook);
                    }
                }
            }
        }

    public static List<sem3_Task3> GettitleList() {
        List<sem3_Task3> titleList = new ArrayList<sem3_Task3>();
        titleList.add(new sem3_Task3("Преступление и наказание", "Достоевский_Федор_Михайлович", 215, 2020, 592));
        titleList.add(new sem3_Task3("На дне", "Пешко́в_лексе́й_Макси́мович", 210, 2023, 160));
        titleList.add(new sem3_Task3("Ловец видений", "Лукьяненко_Сергей_Васильевич", 299, 2020, 390));
        titleList.add(new sem3_Task3("Ревизор", "Гоголь_Николай_Васильевич", 149, 2008, 90));
        titleList.add(new sem3_Task3("Сердце_Пармы", "Аверкиев", 320, 2013, 500));
        titleList.add(new sem3_Task3("Степан_Эрзя", "Абрамов_Кузьма_Григорьевич", 240, 1980 ,560));
        return titleList;
    }
}

