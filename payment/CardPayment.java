package in.riyansh.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class CardPayment implements Payment
{
    @Override
    public void paymentDone()
    {
        System.out.println("Paying via card");
        System.out.println("Payment Done");
    }
}
