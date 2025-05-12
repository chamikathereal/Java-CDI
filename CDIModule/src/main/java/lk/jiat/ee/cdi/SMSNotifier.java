package lk.jiat.ee.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import lk.jiat.ee.annotation.SMS;

@SMS
@ApplicationScoped
public class SMSNotifier implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notifier: sending SMS..." + message);
    }
}
