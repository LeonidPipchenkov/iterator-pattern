package net.happiness;

import net.happiness.model.catalog.BookStoreCatalog;
import net.happiness.model.catalog.ComicStoreCatalog;
import net.happiness.model.catalog.StoreCatalog;
import net.happiness.model.product.Product;

import java.util.Iterator;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        printBookStoreCatalog();

        System.out.println("----------");

        printComicStoreCatalog();

        System.out.println("----------");

        removeFromBookCatalog();
    }

    private static void printBookStoreCatalog() {
        StoreCatalog catalog = new BookStoreCatalog();
        System.out.println("Printing book store catalog:");
        printStoreCatalog(catalog);
    }

    private static void printComicStoreCatalog() {
        StoreCatalog catalog = new ComicStoreCatalog();
        System.out.println("Printing comic store catalog:");
        printStoreCatalog(catalog);
    }

    private static void removeFromBookCatalog() {
        StoreCatalog catalog = new BookStoreCatalog();

        System.out.println("Before removing:");
        printStoreCatalog(catalog);
        System.out.println();

        removeBookByName(catalog, "Rock");
        System.out.println();

        System.out.println("After removing:");
        printStoreCatalog(catalog);
    }

    private static void printStoreCatalog(StoreCatalog catalog) {
        Iterator<Product> iterator = catalog.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.getName() + "; " + product.getDescription() + "; " + product.getPrice() + "$");
        }
    }

    private static void removeBookByName(StoreCatalog catalog, String name) {
        System.out.println("Removing product with name: " + name);
        Iterator<Product> iterator = catalog.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (Objects.equals(product.getName(), name)) {
                iterator.remove();
            }
        }
    }

}
