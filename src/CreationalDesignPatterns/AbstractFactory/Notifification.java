package AbstractFactory;

import AbstractFactory.Entity.User;
import AbstractFactory.Factory.NotificationServiceFactory;
import AbstractFactory.Interface.NotificationService;

public class Notifification {
    public static void main(String[] args) {
        // Example User: Email type
        User user1 = new User("", "gmail", "email");
        NotificationService nService1 = NotificationServiceFactory.getService(user1);
        nService1.sendNotification();

        // Example User: SMS type
        User user2 = new User("GP", null, "sms");
        NotificationService nService2 = NotificationServiceFactory.getService(user2);
        nService2.sendNotification();

    }
}
