package net.happiness.iterator.impl;

import net.happiness.iterator.ProductIterator;
import net.happiness.model.Product;

public class BookStoreIterator implements ProductIterator {

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

}
