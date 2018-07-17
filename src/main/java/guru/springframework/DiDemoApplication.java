package guru.springframework;

import guru.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        // We not call any "new", spring has already create a MyController (Because it is annotated with @Controller)
        MyController createdControllerFromSpring = (MyController) context.getBean("myController");
        createdControllerFromSpring.hello();
    }
}
