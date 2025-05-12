package lk.jiat.ee.ejb;

import jakarta.ejb.Stateless;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import lk.jiat.ee.annotation.Console;
import lk.jiat.ee.annotation.Email;
import lk.jiat.ee.annotation.SMS;
import lk.jiat.ee.cdi.NotificationService;
import lk.jiat.ee.ejb.remote.UserRegistration;

import java.rmi.RemoteException;

@Stateless
public class UserRegistrationSessionBean implements UserRegistration {

    @Inject
    @Email
    NotificationService notificationService;

    @Inject
    @Console
    private Event<String> logEvent;

    @Override
    public void registerUser(String firsName, String lastName, String email, String password) {
        notificationService.sendNotification("Hello, " + firsName + " " + lastName + " " + email);
        logEvent.fire("UserRegistration email send...");
    }
}
