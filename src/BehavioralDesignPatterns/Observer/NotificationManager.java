package BehavioralDesignPatterns.Observer;

//Subscriber-> Concrete Observer - Customer Notification Service
class NotificationService implements ProductObserver {
    @Override
    public void update(Product product) {
        System.out.println("Notification Service: Sending new product alert to subscribed customers - " +
                "New arrival: " + product.getName() + " at $" + product.getPrice());
    }
}