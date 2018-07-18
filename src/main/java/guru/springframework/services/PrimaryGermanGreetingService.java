package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"}) //German Primary Profile
public class PrimaryGermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo vom Begrüßungsdienst";
    }
}
