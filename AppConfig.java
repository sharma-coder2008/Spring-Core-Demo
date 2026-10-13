package in.riyansh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig
{
    @Bean
    public User createUser()
    {
        return new User("Riyansh", 18);
    }
}
