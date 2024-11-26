public class Main {
    public static void main(String[] args) {
        User user = new User("bl");
        SMSService smsService = SMSServiceFactory.getService(user);
        smsService.sendSMS();
    }
}
