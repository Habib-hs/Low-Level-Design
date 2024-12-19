package BehavioralDesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// Product Catalog (Subject)
class ProductCatalog {
    private List<ProductObserver> observers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers(product);
    }

    public void registerObserver(ProductObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ProductObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Product product) {
        for (ProductObserver observer : observers) {
            observer.update(product);
        }
    }
}

