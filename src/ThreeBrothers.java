import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt() + scanner.nextInt();

        if (sum == 5) {
            System.out.println(1);
        }
        if (sum == 4) {
            System.out.println(2);
        }
        if (sum == 3) {
            System.out.println(3);
        }

    }
}
