import java.util.Scanner;

public class ShoppingCartSystem {
    String[] shoppingCart = new String[100];
    int[] price = new int[100];
    int[] quantity = new int[100];
    int[] discount = new int[100];
    static int itemCount = 0;

    static Scanner scanner = new Scanner(System.in);

    void addNamePrice() {
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        int priceInt = scanner.nextInt();
        scanner.nextLine();

        this.shoppingCart[itemCount] = name;
        this.price[itemCount] = priceInt;
        this.quantity[itemCount] = 1;
        itemCount++;
        System.out.println("Item added: " + name + " price: " + priceInt);
    }

    void addNamePriceQty() {
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        int priceInt = scanner.nextInt();
        System.out.println("Enter the quantity of the item: ");
        int quantityInt = scanner.nextInt();
        scanner.nextLine();

        this.shoppingCart[itemCount] = name;
        this.price[itemCount] = priceInt;
        this.quantity[itemCount] = quantityInt;
        itemCount++;
        System.out.println("Item added: " + name + " price: " + priceInt + " quantity: " + quantityInt);
    }

    void addNamePriceQtyDiscount() {
        System.out.println("Enter the name of the item: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        int priceInt = scanner.nextInt();
        System.out.println("Enter the quantity of the item: ");
        int quantityInt = scanner.nextInt();
        System.out.println("Enter the discount percentage: ");
        int discountInt = scanner.nextInt();
        scanner.nextLine();

        this.shoppingCart[itemCount] = name;
        this.price[itemCount] = priceInt;
        this.quantity[itemCount] = quantityInt;
        this.discount[itemCount] = discountInt;
        itemCount++;
        System.out.println("Item added: " + name + " price: " + priceInt +
                " quantity: " + quantityInt + " discount: " + discountInt + "%");
    }

    void viewCart() {
        System.out.println("Shopping Cart:");
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + ". " + "name: " + this.shoppingCart[i] + " price: " + this.price[i] +
                        " quantity: " + this.quantity[i] + " discount: " + this.discount[i] + "%");
            }
        }
    }

    void calculateTotal() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            int priceAfterDiscount = this.price[i] * this.quantity[i] * (100 - this.discount[i]) / 100;
            total += priceAfterDiscount;
        }
        System.out.println("Total price including discounts: " + total);
    }

    public static void main(String[] args) {
        int choice;
        ShoppingCartSystem system = new ShoppingCartSystem();

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
                    system.addNamePrice();
                    break;
                case 2:
                    system.addNamePriceQty();
                    break;
                case 3:
                    system.addNamePriceQtyDiscount();
                    break;
                case 4:
                    system.viewCart();
                    break;
                case 5:
                    system.calculateTotal();
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
