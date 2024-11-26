class SMSServiceFactory {
    public static SMSService getService(User user) {
        if (user.phone.equals("gp")) {
            return new GPService();
        } else {
            return new BLService();
        }
    }
}