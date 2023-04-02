import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double distance;

        do {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu - ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please enter the CM Value: ");
                    distance = scanner.nextDouble();
                    System.out.println(distance + " CM = " + (distance / 100) + " M");
                    break;
                case 2:
                    System.out.print("Please enter the M Value: ");
                    distance = scanner.nextDouble();
                    System.out.println(distance + " M = " + (distance / 1000) + " KM");
                    break;
                case 3:
                    System.out.print("Please enter the KM Value: ");
                    distance = scanner.nextDouble();
                    System.out.println(distance + " KM = " + (distance * 1000) + " M");
                    break;
                case 4:
                    System.out.print("Please enter the M Value: ");
                    distance = scanner.nextDouble();
                    System.out.println(distance + " M = " + (distance * 100) + " CM");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to Continue (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        scanner.close();
    }
}
