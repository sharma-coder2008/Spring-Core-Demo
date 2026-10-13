package in.riyansh.payment;

public class CardPayment implements Payment
{
    @Override
    public void paymentDone()
    {
        System.out.println("Paying via card");
        System.out.println("Payment Done");
    }
}
