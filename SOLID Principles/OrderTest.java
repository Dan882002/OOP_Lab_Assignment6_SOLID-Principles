// Single Responsibility Principle: Each class should have a single responsibility.
// Interface Segregation Principle: Clients should not be forced to depend on interfaces they do not use.

// Open-Closed Principle: Classes should be open for extension but closed for modification.
// Liskov Substitution Principle: Subtypes must be substitutable for their base types.

public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoiceGenerator = new InvoiceAction();
        invoiceGenerator.generateInvoice("order_123.pdf");

        EmailNotifier emailNotifier = new EmailAction();
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}
