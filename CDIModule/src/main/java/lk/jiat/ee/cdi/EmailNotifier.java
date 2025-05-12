package lk.jiat.ee.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import lk.jiat.ee.annotation.Email;

@Email
@ApplicationScoped
public class EmailNotifier implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notifier: sending email..." + message);
    }
}
