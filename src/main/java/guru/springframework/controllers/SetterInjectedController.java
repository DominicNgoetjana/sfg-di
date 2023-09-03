package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by dngoetjana on 2023/09/03.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
