package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dngoetjana on 2023/09/03.
 */
@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }

}
