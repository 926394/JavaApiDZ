package javaDZ;
/**
1. Дан массив записей: наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class sem3_Task1 {
    public String name;
    public String variety;
    public double price;

    public sem3_Task1(String name, String variety, double price) {
        this.name = name;
        this.variety = variety;
        this.price = price;
    }
}
