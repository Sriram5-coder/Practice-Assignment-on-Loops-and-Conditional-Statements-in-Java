public class Triangle_pattern {
    public static void main(String[] args) {
        // loop for top half of the pattern
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // loop for bottom half of the pattern
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
