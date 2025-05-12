package lk.jiat.ee.ejb.remote;

import jakarta.ejb.Remote;

@Remote
public interface Appsetting {
    String getName();
    String getVersion();
    String getDescription();
}
