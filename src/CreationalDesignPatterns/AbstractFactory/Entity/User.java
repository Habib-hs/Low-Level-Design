package AbstractFactory.Entity;

public class User {
   public String phone, email, notificationType;

    public User(String phone, String email,String notificationType) {
        this.phone = phone;
        this.email = email;
        this.notificationType = notificationType;
    }
}
