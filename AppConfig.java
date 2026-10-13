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

    @Bean
    public CartService createCartService()
    {
        return new CartService();
    }

    @Bean
    @Qualifier("cp")
    public Payment cpay()
    {
        return new CardPayment();
    }

    @Bean
    @Qualifier("up")
    public Payment upay()
    {
        return new UpiPayment();
    }

    @Bean
    public OrderService os(@Qualifier("up") Payment pay)
    {
        return new OrderService(pay);
    }


    /*@Bean Through Setter
    public OrderService os()
    {
        return new OrderService();
    }*/
}
