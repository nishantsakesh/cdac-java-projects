import java.util.Scanner;

public class ElectricityApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityConnection connection = new ElectricityConnection(id, name, units);
                
        connection.displayBill();

        sc.close();
    }
}