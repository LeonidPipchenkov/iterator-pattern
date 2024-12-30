package net.happiness.model;

import net.happiness.iterator.impl.ComicStoreIterator;
import net.happiness.iterator.ProductIterator;

import java.util.ArrayList;
import java.util.List;

public class ComicStoreCatalog {

    private final List<Product> catalog;

    public ComicStoreCatalog() {
        catalog = new ArrayList<>();
        fillCatalog();
    }

    public ProductIterator iterator() {
        return new ComicStoreIterator(catalog);
    }

    private void fillCatalog() {
        addItem(new Product("Superman Comic", "Superhero comic", 12.99));
        addItem(new Product("Batman Comic", "Superhero comic", 11.99));
        addItem(new Product("Star Wars", "\"Star wars\" comic", 39.99));
        addItem(new Product("Jedi T-Shirt", "\"Star wars\" merch", 29.99));
    }

    private void addItem(Product product) {
        catalog.add(product);
    }

}
