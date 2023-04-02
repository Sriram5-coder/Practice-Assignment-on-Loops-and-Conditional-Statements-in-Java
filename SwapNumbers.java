import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB, temp;

        System.out.print("Enter the value of numA: ");
        numA = sc.nextInt();

        System.out.print("Enter the value of numB: ");
        numB = sc.nextInt();

        // swapping values using a temporary variable
        temp = numA;
        numA = numB;
        numB = temp;

        System.out.println("After swapping:");
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
    }
}
