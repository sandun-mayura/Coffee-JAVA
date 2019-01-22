import java.util.Arrays;
import java.util.Scanner;

public class CoffeeBill {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------COFFEE ITEMS-------");
        System.out.println("ID    DESCRIPTION    UNIT-PRICE");

        String[] coffeeArray = new String[]{"01    Caffé macchiato   $2",
                                            "02    Café mélange      $3",
                                            "03    Irish Coffee      $5",
                                            "04    Vienna            $7",
                                            "05    Cappuccino        $8",
                                            "06    Coffee milk       $10"};
        Arrays.stream(coffeeArray).forEach(System.out::println);

        System.out.println("\nPlease enter the coffee id : ");
        String cId = scanner.nextLine(); //get coffee type
        int cNumber = Integer.parseInt(cId);// convert to Int

        System.out.println("Please enter quantity : ");
        String quantity = scanner.nextLine(); //get coffee quantity
        int cQuantity = Integer.parseInt(quantity);// convert to Int

        
if (cNumber<=coffeeArray.length) {

    System.out.println("------BILL DESCRIPTION-------");
    System.out.println("ID    DESCRIPTION    UNIT-PRICE  QUANTITY   ");
    System.out.println(coffeeArray[(cNumber - 1)] + "           " + quantity);
}
        int totalPrice;
        switch (cNumber) {
            case 1:
                totalPrice = cQuantity * 2;

                System.out.println("TOTAL-AMOUNT : $" + totalPrice);
                break;

            case 2:
                totalPrice = cQuantity * 3;
                System.out.println("TOTAL-AMOUNT : $" + totalPrice);
                break;
            case 3:
                totalPrice = cQuantity * 5;
                System.out.println("TOTAL-AMOUNT : $" + totalPrice);
                break;
         case 4:
                totalPrice = cQuantity * 7;
                System.out.println("TOTAL-AMOUNT : $" + totalPrice);
                break;
         case 5:
                totalPrice = cQuantity * 8;
                System.out.println("TOTAL-AMOUNT : $" + totalPrice);
                break;
         case 6:
                totalPrice = cQuantity * 10;
                System.out.println("TOTAL-AMOUNT : $" + totalPrice);
                break;

            // You can have any number of case statements.
            default:
                System.out.println("You enter item number is not exiting.");

        }
    }


}