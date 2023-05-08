package javaDZ;
/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class sem3_Task2 {
    public String name;
    public String country;
    public int kilogram;
    public double price;
    public String variety;
    public sem3_Task2(String name, String country, int kilogram, double price, String variety) {
        this.name = name;
        this.country = country;
        this.kilogram = kilogram;
        this.price = price;
        this.variety = variety;
    }
}
