package in.riyansh;

import in.riyansh.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    Payment pay;

    /*Through Setter
    @Autowired
    public void setPay(Payment pay) {
        this.pay = pay;
    }
     */

    public OrderService(Payment pay)
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
