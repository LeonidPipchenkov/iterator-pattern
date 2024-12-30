package net.happiness.iterator;

import net.happiness.model.product.Product;

import java.util.Iterator;

public class BookStoreIterator implements Iterator<Product> {

    private final Product[] catalog;
    private int position = -1;

    public BookStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        int nextPosition = position + 1;
        return nextPosition < catalog.length && catalog[nextPosition] != null;
    }

    @Override
    public Product next() {
        position++;
        return catalog[position];
    }

    @Override
    public void remove() {
        if (position > -1) {
            for (int i = position; i < catalog.length - 1; i++) {
                catalog[i] = catalog[i + 1];
            }
            catalog[catalog.length - 1] = null;
        } else {
            System.out.println("Cannot remove product. Product is undefined.");
        }
    }

}
