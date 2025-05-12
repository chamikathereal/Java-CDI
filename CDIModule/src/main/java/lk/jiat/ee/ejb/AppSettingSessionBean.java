package lk.jiat.ee.ejb;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import lk.jiat.ee.cdi.MyService;
import lk.jiat.ee.ejb.remote.Appsetting;

@Stateless
public class AppSettingSessionBean implements Appsetting {

    @Inject
    private MyService myService;

    @Override
    public String getName() {
        myService.doSomething();
        return "CDI-Module App Setting";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "The is the CDI App Setting Bean";
    }
}
