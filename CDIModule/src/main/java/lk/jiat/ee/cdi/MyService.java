package lk.jiat.ee.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class MyService {
    public void doSomething() {
        System.out.println( "MyService doSomething....." + " " + this);
    }
}
