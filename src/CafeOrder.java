public class CafeOrder {
    public static void main(String[] args) {
        // Declare constants for product prices
        final double DECALF_PRICE = 2.50;
        final double CHAI_PRICE = 3.75;
        final double LATTE_PRICE = 2.00;


        int DecalfQuantity = 3;
        int chaiQuantity = 4;
        int LatteQuantity = 2;


        final double SALES_TAX = 0.08;  // 8% sales tax


        double subtotal = (DecalfQuantity * DECALF_PRICE)
                + (chaiQuantity * CHAI_PRICE)
                + (LatteQuantity * LATTE_PRICE);


        double totalSale = subtotal * (1 + SALES_TAX);


        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Sales Tax (8%%): $%.2f\n", subtotal * SALES_TAX);
        System.out.printf("Total Sale (with tax): $%.2f\n", totalSale);
    }
}

