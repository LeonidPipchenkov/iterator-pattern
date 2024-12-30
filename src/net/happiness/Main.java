package net.happiness;

import net.happiness.iterator.ProductIterator;
import net.happiness.model.BookStoreCatalog;
import net.happiness.model.ComicStoreCatalog;
import net.happiness.model.Product;

public class Main {

    public static void main(String[] args) {
        printBookStoreCatalog();
        System.out.println();
        printComicStoreCatalog();
    }

    private static void printBookStoreCatalog() {
        BookStoreCatalog catalog = new BookStoreCatalog();
        ProductIterator iterator = catalog.iterator();
        System.out.println("Printing book store catalog:");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.getName() + "; " + product.getDescription() + "; " + product.getPrice() + "$");
        }
    }

    private static void printComicStoreCatalog() {
        ComicStoreCatalog catalog = new ComicStoreCatalog();
        ProductIterator iterator = catalog.iterator();
        System.out.println("Printing comic store catalog:");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.getName() + "; " + product.getDescription() + "; " + product.getPrice() + "$");
        }
    }

}
