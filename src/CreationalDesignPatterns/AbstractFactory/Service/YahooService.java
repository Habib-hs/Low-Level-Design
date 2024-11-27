package AbstractFactory.Service;

import AbstractFactory.Interface.EmailService;

public class YahooService implements EmailService {
    @Override
    public void sendMail() {
        System.out.println("send notification mail via Yahoo Service!");
    }
}
