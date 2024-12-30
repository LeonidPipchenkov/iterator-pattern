package net.happiness.iterator;

import net.happiness.model.product.Product;

import java.util.Iterator;
import java.util.List;

public class ComicStoreIterator implements Iterator<Product> {

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
