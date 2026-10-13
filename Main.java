package in.riyansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    static void main()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("User: ");
        User us = context.getBean(User.class);
        System.out.println(us.getName());

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        CartService cs = context.getBean(CartService.class);
        cs.cart();
    }
}