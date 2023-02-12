package Strategy;

interface PaymentStrategy {
    public void pay(int amount);
}

class CreditCardPaymentStrategy implements PaymentStrategy{
    private String name;
    private String creditCardNumber;
    private String cvv;
    private String dateOfExpiry;


    public CreditCardPaymentStrategy(String name, String creditCardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid with " + amount);
    }
}

class PaypalPaymentStrategy implements PaymentStrategy{
    private String emailid;
    private String password;

    public PaypalPaymentStrategy(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;
    }


    @Override
    public void pay(int amount) {
        System.out.println("paid with paypal " + amount);
    }
}
