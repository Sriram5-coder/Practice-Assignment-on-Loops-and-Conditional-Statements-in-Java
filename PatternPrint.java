public class PatternPrint {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
