package onlineFoodOrderSystem09;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ordermanager manager = new ordermanager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add Item 2.Menu 3.Place Order 4.View All 5.Process 6.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> manager.addFoodItem();
                case 2 -> manager.viewMenu();
                case 3 -> manager.placeOrder();
                case 4 -> manager.viewOrders();
                case 5 -> manager.processNextOrder();
                case 6 -> System.exit(0);
            }
        }
    }
}
