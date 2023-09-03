package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by dngoetjana on 2023/09/02.
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!");
        return "Hi, folks.";
    }

}
