package net.happiness;

import net.happiness.iterator.ProductIterator;
import net.happiness.model.ComicStoreCatalog;
import net.happiness.model.Product;

public class Main {

    public static void main(String[] args) {
        printComicStoreCatalog();
    }

    private static void printComicStoreCatalog() {
        System.out.println("Printing comic store catalog:");
        ComicStoreCatalog catalog = new ComicStoreCatalog();
        ProductIterator iterator = catalog.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product.getName() + "; " + product.getDescription() + "; " + product.getPrice() + "$");
        }
    }

}
