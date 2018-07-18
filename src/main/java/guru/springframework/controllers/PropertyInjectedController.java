package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {

    // Hard Class Name !
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
