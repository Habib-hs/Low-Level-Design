package AbstractFactory.Service;

import AbstractFactory.Interface.SMSService;

public class GPService implements SMSService {
    @Override
    public void sendSMS() {
        System.out.println("SMS coming from the GrameenPhone!");
    }
}
