package net.happiness.model;

public class BookStoreCatalog {

    private static final int MAX_ITEMS = 5;

    private final Product[] catalog;
    private int productNumber;

    public BookStoreCatalog() {
        catalog = new Product[MAX_ITEMS];
        fillCatalog();
    }

    public Product[] getCatalog() {
        return catalog;
    }

    private void fillCatalog() {
        addItem(new Product("Java Design Patterns", "Software development book", 139.99));
        addItem(new Product("C++ is not dead", "T-Shirt", 39.99));
        addItem(new Product("Rock", "Mouse pad", 19.99));
        addItem(new Product("Web Development", "Software development book", 49.99));
    }

    private void addItem(Product product) {
        if (productNumber < MAX_ITEMS) {
            catalog[productNumber] = product;
            productNumber++;
        } else {
            System.out.println("Catalog is full. Cannot add product.");
        }
    }

}
