package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

//    // Hard Class Name !
//    @Autowired
//    @Qualifier("greetingServiceImpl")
//    public GreetingService greetingService;

    // ALSO IF NAME IS SAME WITH IMPLEMENTED CLASS, THAT WILL BE OK!
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
