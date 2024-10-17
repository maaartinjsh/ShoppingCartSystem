import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            int choice;
            System.out.println("Shopping Cart System");
            System.out.println("1. Add item (name, price)");
            System.out.println("2. Add item (name, price, quantity)");
            System.out.println("3. Add item (name, price, quantity, discount)");
            System.out.println("4. View shopping cart");
            System.out.println("5. Calculate total");
            System.out.println("6. Exit");

            String[] shoppingCart = new String[100];
            String[] itemNames = new String[100];
            int[] price = new int[100];
            int[] quantity = new int[100];
            int[] discount = new int[100];

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the item: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the price of the item: ");
                    int priceInt = scanner.nextInt();
                    System.out.println("Enter the quantity of the item: ");
                    int quantityInt = scanner.nextInt();
                case 2:
                    System.out.println("Enter the name of the item: ");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter the price of the item: ");
            }

        }

    }
}
