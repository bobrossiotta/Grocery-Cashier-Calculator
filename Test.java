
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // integer
    //  Grocery Cashier Calculator
    //  Fruits and KG Prices
        //Pear: 2.14 TL
        //Apple : 3.67 TL
        //Tomatoes: 1.11 TL
        //Banana: 0.95 TL
        //Eggplant : 5.00 TL

        int pear,apple,tomatoes,banana,eggplant;
        Scanner bob = new Scanner(System.in);

        System.out.print("pear kg?");
        pear = bob.nextInt();

        System.out.print("apple kg?");
        apple = bob.nextInt();

        System.out.print("tomatoes kg?");
        tomatoes = bob.nextInt();

        System.out.print("banana kg?");
        banana = bob.nextInt();

        System.out.print("eggplant kg?");
        eggplant = bob.nextInt();

        double total_price = pear*2.14+apple*3.67+tomatoes*1.11+banana*0.95+eggplant*5 ;
        System.out.println("Total Price is:"+ total_price);



    } }