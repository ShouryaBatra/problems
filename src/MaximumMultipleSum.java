import java.util.Scanner;

public class MaximumMultipleSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {

            int num = scanner.nextInt();

            if (num == 3) {
                System.out.println(3);
            }
            else {
                System.out.println(2);
            }

        }

    }

}
