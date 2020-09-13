package ru.mirea.ikbo0819.pr1.Book;

import ru.mirea.ikbo0819.pr1.Book.Book;

public class BookTest {
        public static void main(String[] args) {
            Book d1 = new Book("War and Peace", 1225);
            Book d2 = new Book("Anna Karenina", 864);
            Book d3 = new Book("Mysterious Island");
            d3.setPages(480);
            System.out.println(d1);
            d2.intoDiametr();
            d3.intoDiametr();
        }
}