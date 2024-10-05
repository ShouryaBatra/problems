import java.util.Scanner;

public class AlternatingSumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i=0; i<t; i++) {

            int n = scanner.nextInt();
            int answer = 0;

            boolean add = true;
            for (int j=0; j<n; j++) {
                if (j % 2 == 0) {
                    add = true;
                }
                else {
                    add = false;
                }
                if (add) {
                    answer = answer + scanner.nextInt();
                }
                else {
                    answer = answer - scanner.nextInt();
                }

            }
            System.out.println(answer);

        }


    }
}
