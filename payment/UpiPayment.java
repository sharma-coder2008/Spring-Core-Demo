package in.riyansh.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class UpiPayment implements Payment
{
    @Override
    public void paymentDone()
    {
        System.out.println("Paying via UPI");
        System.out.println("Payment Done");
    }
}
