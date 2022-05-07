package strategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String cvv;
    private String cardNumber;
    private String name;
    private String dateOfexpiry;

    public CreditCardStrategy(String cvv, String cardNumber, String name, String dateOfexpiry) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.name = name;
        this.dateOfexpiry = dateOfexpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount " + amount + " paid using credit card");

    }
}
