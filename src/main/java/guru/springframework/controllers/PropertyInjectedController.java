package guru.springframework.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

//    // Hard Class Name !
//    @Autowired
//    @Qualifier("greetingServiceImpl")
//    public GreetingService greetingService;

//    // ALSO IF NAME IS SAME WITH IMPLEMENTED CLASS, THAT WILL BE OK!
//    @Autowired
//    public GreetingService greetingServiceImpl;

    // BUT WE ADD @Primary SO IT WILL NOT USE BEAN BY NAME.
    // Now we have to say what bean if we don't want to use Primary one.
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
