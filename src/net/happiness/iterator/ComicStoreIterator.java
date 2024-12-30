package net.happiness.iterator;

import net.happiness.model.Product;

import java.util.List;

public class ComicStoreIterator implements ProductIterator {

    private final List<Product> catalog;
    private int position;

    public ComicStoreIterator(List<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return position < catalog.size() && catalog.get(position) != null;
    }

    @Override
    public Product next() {
        Product product = catalog.get(position);
        position++;
        return product;
    }

}
