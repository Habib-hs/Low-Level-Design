package AbstractFactory.Factory;

import AbstractFactory.Entity.User;
import AbstractFactory.Interface.EmailService;
import AbstractFactory.Interface.NotificationService;
import AbstractFactory.Service.GmailService;
import AbstractFactory.Service.YahooService;

public class EmailServiceFactory implements NotificationService {
    private EmailService emailService;

    public EmailServiceFactory(User user) {
        if ("gmail".equals(user.email)) {
            emailService = new GmailService();
        } else {
            emailService = new YahooService();
        }
    }

    @Override
    public void sendNotification() {
        emailService.sendMail();
    }
}
