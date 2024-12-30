package net.happiness.iterator;

import net.happiness.model.Product;

public interface ProductIterator {
    boolean hasNext();
    Product next();
}
