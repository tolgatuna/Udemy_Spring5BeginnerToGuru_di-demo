package guru.springframework;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        // We not call any "new", spring has already create a MyController (Because it is annotated with @Controller)

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println("Fake Data Source User : " + fakeDataSource.getUser());
        System.out.println("Fake Data Source Pass : " + fakeDataSource.getPassword());
        System.out.println("Fake Data Source Url  : " + fakeDataSource.getUrl());

        FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);
        System.out.println("Fake JMS Source User : " + fakeJmsBroker.getUserName());
        System.out.println("Fake JMS Source Pass : " + fakeJmsBroker.getPassword());
        System.out.println("Fake JMS Source Url  : " + fakeJmsBroker.getUrl());
    }
}
