package in.riyansh;

import in.riyansh.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    Payment pay;

    public OrderService(@Qualifier("up") Payment pay)
    {
        this.pay = pay;
    }

    /*@Autowired
    public OrderService(Payment pay)
    {
        this.pay = pay;
    }*/

    void placeOrder()
    {
        pay.paymentDone();
        System.out.println("Order Placed.");
    }
}
