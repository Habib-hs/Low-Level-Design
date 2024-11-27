package AbstractFactory.Factory;

import AbstractFactory.Entity.User;
import AbstractFactory.Interface.NotificationService;

public class NotificationServiceFactory {
    public static NotificationService getService(User user) {
        NotificationService notification;
        if ("email".equals(user.notificationType)) {
            notification = new EmailServiceFactory(user);
        } else {
            notification = new SMSServiceFactory(user);
        }
        return notification;
    }
}