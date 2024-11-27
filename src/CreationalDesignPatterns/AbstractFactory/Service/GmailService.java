package AbstractFactory.Service;

import AbstractFactory.Interface.EmailService;

public class GmailService implements EmailService {
    @Override
    public void sendMail() {
        System.out.println("send notification mail via Gmail Service!");
    }
}
