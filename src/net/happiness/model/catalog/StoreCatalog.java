package net.happiness.model.catalog;

import net.happiness.model.product.Product;

import java.util.Iterator;

public interface StoreCatalog {
    Iterator<Product> iterator();
}
