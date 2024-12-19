package BehavioralDesignPatterns.Observer;

// Subscriber -- > Concrete Observer - Search Index Updater
class SearchIndexUpdater implements ProductObserver {
    @Override
    public void update(Product product) {
        System.out.println("Search Index Updater: Adding " + product.getName() +
                " to search index for immediate discovery");
    }
}
