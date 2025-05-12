package lk.jiat.ee.ejb.remote;

import jakarta.ejb.Remote;

import java.rmi.RemoteException;

@Remote
public interface UserRegistration {
    void registerUser(String firsName, String lastName, String email, String password);
}
