import java.util.Scanner;

public class ShoppingCartSystem {
    String[] shoppingCart = new String[100];
    int[] price = new int[100];
    int[] quantity = new int[100];
    int[] discount = new int[100];
    static int itemCount = 0;

    static Scanner scanner = new Scanner(System.in);

        static void addNamePrice() {
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        int priceInt = scanner.nextInt();
        scanner.nextLine();

        ShoppingCartSystem system = new ShoppingCartSystem();
        system.shoppingCart[itemCount] = name;
        system.price[itemCount] = priceInt;
        system.quantity[itemCount] = 1;
        itemCount++;
        System.out.println("Item added: " + name + "price: " + priceInt);
    }

    static void addNamePriceQty() {
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        int priceInt = scanner.nextInt();
        System.out.println("Enter the quantity of the item: ");
        int quantityInt = scanner.nextInt();
        scanner.nextLine();

        ShoppingCartSystem system = new ShoppingCartSystem();
        system.shoppingCart[itemCount] = name;
        system.price[itemCount] = priceInt;
        system.quantity[itemCount] = quantityInt;
        itemCount++;
        System.out.println("Item added: " + name + "price: " + priceInt + "quantity: " + quantityInt);
    }

    static void addNamePriceQtyDiscount() {
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        int priceInt = scanner.nextInt();
        System.out.println("Enter the quantity of the item: ");
        int quantityInt = scanner.nextInt();
        System.out.println("Enter the discount percentage: ");
        int discountInt = scanner.nextInt();
        scanner.nextLine();

        ShoppingCartSystem system = new ShoppingCartSystem();
        system.shoppingCart[itemCount] = name;
        system.price[itemCount] = priceInt;
        system.quantity[itemCount] = quantityInt;
        system.discount[itemCount] = discountInt;
        itemCount++;
        System.out.println("Item added: " + name + "price: " + priceInt + ", quantity: " + quantityInt + " and discount: " + discountInt + "%");
    }

    static void viewCart(ShoppingCartSystem system) {
        System.out.println("Shopping Cart:");
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + ". " + system.shoppingCart[i] + " - price: " + system.price[i] + ", quantity: " + system.quantity[i] + "and discount: " + system.discount[i] + "%");
            }
        }
    }

    static void calculateTotal(ShoppingCartSystem system) {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            int priceAfterDiscount = system.price[i] * system.quantity[i] * (100 - system.discount[i]) / 100;
            total += priceAfterDiscount;
        }
        System.out.println("Total price including discounts: " + total);
    }

    public static void main(String[] args) {
        int choice;
        ShoppingCartSystem cartSystem = new ShoppingCartSystem();

        do {
            System.out.println("\nShopping Cart System");
            System.out.println("1. Add item (name, price)");
            System.out.println("2. Add item (name, price, quantity)");
            System.out.println("3. Add item (name, price, quantity, discount)");
            System.out.println("4. View shopping cart");
            System.out.println("5. Calculate total");
            System.out.println("6. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNamePrice();
                    break;
                case 2:
                    addNamePriceQty();
                    break;
                case 3:
                    addNamePriceQtyDiscount();
                    break;
                case 4:
                    viewCart(cartSystem);
                    break;
                case 5:
                    calculateTotal(cartSystem);
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 6);
    }
}
