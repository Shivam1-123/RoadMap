package Strategy;

public class Main {
	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        cart.checkout(150.0);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(200.0);

        // Pay using Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(300.0);
    }

}
