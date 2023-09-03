package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by dngoetjana on 2023/09/03.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
