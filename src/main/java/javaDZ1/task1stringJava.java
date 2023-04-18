package javaDZ1;
// Дана строка, нужно произвести реверс слов "the sky is blue", "blue is sky the"
public class task1stringJava {

    public static void main(String[] args) {
        System.out.println(reversStr("the sky is blue"));
        System.out.println(reversStr("world hello"));
        System.out.println(reversStr("a good example"));
    }
    public static String reversStr(String s) {
        String[] c = s.split(" ");
        String newStr = "";
        for (int i = c.length - 1; i >= 0; i--) {
            newStr += c[i];
            newStr += " ";
        }
        return newStr;
    }
}