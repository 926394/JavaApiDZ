package javaDZ;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class sem3_Task3 {
        public String nameBook;
        public String authorName;
        public double price;
        public int earEdition;
        public int numPages;

        public sem3_Task3(String nameBook, String authorName, double price, int earEdition, int numPages) {
            this.nameBook = nameBook;
            this.authorName = authorName;
            this.price = price;
            this.earEdition = earEdition;
            this.numPages = numPages;
        }
    }
