package AbstractFactory.Factory;

import AbstractFactory.Entity.User;
import AbstractFactory.Interface.NotificationService;
import AbstractFactory.Interface.SMSService;
import AbstractFactory.Service.BLService;
import AbstractFactory.Service.GPService;

public class SMSServiceFactory implements NotificationService {
    private SMSService smsService;

    public SMSServiceFactory(User user) {
        if ("gp".equals(user.phone)) {
            smsService = new GPService();
        } else {
            smsService = new BLService();
        }
    }

    @Override
    public void sendNotification() {
        smsService.sendSMS();
    }
}
