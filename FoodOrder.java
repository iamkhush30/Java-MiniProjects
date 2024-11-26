import java.util.*;

public class FoodOrder {

    // define constants for maximum number of food items and name length
    static int MAX_FOOD = 50;

    // create a nested class to represent a single food item
    static class FoodItem {
        String name;
        double price;

        public FoodItem(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    // array to store food items and variable
    static FoodItem[] menu = new FoodItem[MAX_FOOD];
    static int food = 0;

    // function to add a new food item to the menu
    static void addFoodItem() {
        if (food >= MAX_FOOD) {
            System.out.println("menu is full, cannot add items.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter food item: ");
        String name = scanner.nextLine();
        System.out.print("enter food item price: ");
        double price = scanner.nextDouble();

        menu[food] = new FoodItem(name, price); // add new item to the menu array
        food++;
        System.out.println("food item added successfully ");
    }

    // function to display current menu
    static void displayMenu() {

        System.out.println("\n--- food menu ---\n");
        for (int i = 0; i < food; i++) {
            System.out.printf("%d. %s - $%.2f\n", i + 1, menu[i].name, menu[i].price);
        }
        System.out.println("------------------\n");
    }

    // function to handle placing an order
    static void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double total = 0.0;
        StringBuilder orderSummary = new StringBuilder("order summary:\n");

        while (true) {
            displayMenu();
            System.out.print("select food item by number (0 for finish): ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break; // exit loop if user chooses 0 to finish
            } else if (choice < 1 || choice > food) {
                System.out.println("invalid choice! please try again.");
            } else {
                total += menu[choice - 1].price; // Add price of selected item
                orderSummary.append(menu[choice - 1].name).append("\n");
                System.out.printf("added %s to your orders.", menu[choice - 1].name);

            }
        }

        System.out.printf("%sTotal Cost: $%.2f\n", orderSummary.toString(), total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("--- Food Order Management System ---");
            System.out.println("1. add food item");
            System.out.println("2. display menu");
            System.out.println("3. place order");
            System.out.println("4. exit");
            System.out.print("select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addFoodItem();
                    break;
                case 2:
                    displayMenu();
                    break;
                case 3:
                    placeOrder();
                    break;
                case 4:
                    System.out.println("exiting the system.");
                    System.exit(4);
                default:
                    System.out.println("invalid option, please try again.");
            }
        }
    }
}