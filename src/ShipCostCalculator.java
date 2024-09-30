import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarations
        double itemPrice;
        final double FREE_SHIPPING_REACHED =100;
        double shippingCost;

        System.out.println ("What is the price of the item?");
        itemPrice = scanner.nextDouble();

        if (itemPrice >= FREE_SHIPPING_REACHED) {
            System.out.println("You have free shipping!");
        } else {
            shippingCost =itemPrice * .02;
            System.out.println("The shipping is " + shippingCost + ", and your total is " + (itemPrice + shippingCost) );

        }


        scanner.close();
    }
}