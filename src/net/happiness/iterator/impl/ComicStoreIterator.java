package net.happiness.iterator.impl;

import net.happiness.iterator.ProductIterator;
import net.happiness.model.Product;

import java.util.List;

public class ComicStoreIterator implements ProductIterator {

    private final List<Product> catalog;
    private int position = -1;

    public ComicStoreIterator(List<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        int nextPosition = position + 1;
        return nextPosition < catalog.size() && catalog.get(nextPosition) != null;
    }

    @Override
    public Product next() {
        position++;
        return catalog.get(position);
    }

}
