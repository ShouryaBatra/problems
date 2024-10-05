import java.util.Scanner;
import java.util.Arrays;
public class OnlyPluses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {


            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int[] arr = {a, b, c};
            Arrays.sort(arr);
//			int smallestNumberIndex = 0;
            for (int j=0; j<5; j++) {

                arr[0]++;
                Arrays.sort(arr);

            }

            int answer = 1;

            for (int j=0; j<3; j++) {
                answer = answer * arr[j];
            }

            System.out.println(answer);
        }

    }
}
