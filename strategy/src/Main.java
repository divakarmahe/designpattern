public class Main{
    public static void main(String[] args){
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy payPal = new PaypalPayment();
        PaymentStrategy crypto = new CryptoPayment();
        PaymentProcessor processor = new PaymentProcessor(creditCard);
        processor.processPayment();
        processor.setPaymentStrategy(payPal);
        processor.processPayment();
        processor.setPaymentStrategy(crypto);
        processor.processPayment();
    }
}