package guru.springframework.services;

/**
 * Created by dngoetjana on 2023/09/03.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
