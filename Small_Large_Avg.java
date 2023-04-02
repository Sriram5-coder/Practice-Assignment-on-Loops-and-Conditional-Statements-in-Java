import java.util.Scanner;

public class Small_Large_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter three integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Finding the smallest number
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Finding the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Finding the average of all three numbers
        double average = (num1 + num2 + num3) / 3.0;

        // Printing the results
        System.out.println("The Smallest Number: " + smallest);
        System.out.println("The Largest Number: " + largest);
        System.out.println("Average of all three numbers: " + average);

        sc.close();
    }
}
