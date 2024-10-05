import java.util.Scanner;

public class SakurakosExamTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 0) {
                if (b % 2 == 0) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else if (a % 2 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
