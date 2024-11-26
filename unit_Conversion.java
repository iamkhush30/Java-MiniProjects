import java.util.Scanner;

public class unit_Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nUnit Conversion Menu:");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("3. Temperature Conversion");
            System.out.println("4. Volume Conversion");
            System.out.println("5. Electricity Conversion");
            System.out.println("6. Time Conversion");
            System.out.println("7. Speed Conversion");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lengthConversion(sc);
                    break;
                case 2:
                    weightConversion(sc);
                    break;
                case 3:
                    temperatureConversion(sc);
                    break;
                case 4:
                    volumeConversion(sc);
                    break;
                case 5:
                    electricityConversion(sc);
                    break;
                case 6:
                    timeConversion(sc);
                    break;
                case 7:
                    speedConversion(sc);
                    break;
                case 8:
                    System.out.println("Exiting the program...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Length Conversion Method
    public static void lengthConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Length Conversion:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("4. Kilometers to Miles");
        System.out.println("5. Feet to Meters");
        System.out.println("6. Meters to Feet");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " meters = " + value / 1000 + " kilometers");
                break;
            case 2:
                System.out.println("\n"+value + " kilometers = " + value * 1000 + " meters");
                break;
            case 3:
                System.out.println("\n"+value + " miles = " + value * 1.60934 + " kilometers");
                break;
            case 4:
                System.out.println("\n"+value + " kilometers = " + value / 1.60934 + " miles");
                break;
            case 5:
                System.out.println("\n"+value + " feet = " + value * 0.3048 + " meters");
                break;
            case 6:
                System.out.println("\n"+value + " meters = " + value / 0.3048 + " feet");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Weight Conversion Method
    public static void weightConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Weight Conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.println("3. Grams to Kilograms");
        System.out.println("4. Kilograms to Grams");
        System.out.println("5. Ounces to Grams");
        System.out.println("6. Grams to Ounces");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " kilograms = " + value * 2.20462 + " pounds");
                break;
            case 2:
                System.out.println("\n"+value + " pounds = " + value / 2.20462 + " kilograms");
                break;
            case 3:
                System.out.println("\n"+value + " grams = " + value / 1000 + " kilograms");
                break;
            case 4:
                System.out.println("\n"+value + " kilograms = " + value * 1000 + " grams");
                break;
            case 5:
                System.out.println("\n"+value + " ounces = " + value * 28.3495 + " grams");
                break;
            case 6:
                System.out.println("\n"+value + " grams = " + value / 28.3495 + " ounces");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Temperature Conversion Method
    public static void temperatureConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " Celsius = " + (value * 9 / 5 + 32) + " Fahrenheit");
                break;
            case 2:
                System.out.println("\n"+value + " Fahrenheit = " + ((value - 32) * 5 / 9) + " Celsius");
                break;
            case 3:
                System.out.println("\n"+value + " Celsius = " + (value + 273.15) + " Kelvin");
                break;
            case 4:
                System.out.println("\n"+value + " Kelvin = " + (value - 273.15) + " Celsius");
                break;
            case 5:
                System.out.println(value + " Fahrenheit = " + ((value - 32) * 5 / 9 + 273.15) + " Kelvin");
                break;
            case 6:
                System.out.println("\n"+value + " Kelvin = " + ((value - 273.15) * 9 / 5 + 32) + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Volume Conversion Method
    public static void volumeConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Volume Conversion:");
        System.out.println("1. Liters to Gallons");
        System.out.println("2. Gallons to Liters");
        System.out.println("3. Cubic Meters to Liters");
        System.out.println("4. Liters to Cubic Meters");
        System.out.println("5. Milliliters to Liters");
        System.out.println("6. Liters to Milliliters");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " liters = " + value * 0.264172 + " gallons");
                break;
            case 2:
                System.out.println("\n"+value + " gallons = " + value / 0.264172 + " liters");
                break;
            case 3:
                System.out.println("\n"+value + " cubic meters = " + value * 1000 + " liters");
                break;
            case 4:
                System.out.println("\n"+value + " liters = " + value / 1000 + " cubic meters");
                break;
            case 5:
                System.out.println("\n"+value + " milliliters = " + value / 1000 + " liters");
                break;
            case 6:
                System.out.println("\n"+value + " liters = " + value * 1000 + " milliliters");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Electricity Conversion Method
    public static void electricityConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Electricity Conversion:");
        System.out.println("1. Watts to Kilowatts");
        System.out.println("2. Kilowatts to Watts");
        System.out.println("3. Ampere to Milliampere");
        System.out.println("4. Milliampere to Ampere");
        System.out.println("5. Volt to Millivolt");
        System.out.println("6. Millivolt to Volt");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " watts = " + value / 1000 + " kilowatts");
                break;
            case 2:
                System.out.println("\n"+value + " kilowatts = " + value * 1000 + " watts");
                break;
            case 3:
                System.out.println("\n"+value + " ampere = " + value * 1000 + " milliampere");
                break;
            case 4:
                System.out.println("\n"+value + " milliampere = " + value / 1000 + " ampere");
                break;
            case 5:
                System.out.println("\n"+value + " volt = " + value * 1000 + " millivolt");
                break;
            case 6:
                System.out.println("\n"+value + " millivolt = " + value / 1000 + " volt");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Time Conversion Method
    public static void timeConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Time Conversion:");
        System.out.println("1. Seconds to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.println("3. Hours to Days");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " seconds = " + value / 60 + " minutes");
                break;
            case 2:
                System.out.println("\n"+value + " minutes = " + value / 60 + " hours");
                break;
            case 3:
                System.out.println("\n"+value + " hours = " + value / 24 + " days");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Speed Conversion Method
    public static void speedConversion(Scanner sc) {
        System.out.println("\n/*-----------------------*/");
        System.out.println("Speed Conversion:");
        System.out.println("1. Meters per second to Kilometers per hour");
        System.out.println("2. Kilometers per hour to Meters per second");
        System.out.println("3. Miles per hour to Kilometers per hour");
        System.out.println("4. Kilometers per hour to Miles per hour");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = getValidInput(sc);

        switch (choice) {
            case 1:
                System.out.println("\n"+value + " meters/second = " + value * 3.6 + " kilometers/hour");
                break;
            case 2:
                System.out.println("\n"+value + " kilometers/hour = " + value / 3.6 + " meters/second");
                break;
            case 3:
                System.out.println("\n"+value + " miles/hour = " + value * 1.60934 + " kilometers/hour");
                break;
            case 4:
                System.out.println("\n"+value + " kilometers/hour = " + value / 1.60934 + " miles/hour");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to handle valid input for conversions
    public static double getValidInput(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            sc.next(); // discard the invalid input
        }
        return sc.nextDouble();
    }
}
