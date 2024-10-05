import java.util.Scanner;

public class UltraFastMathmetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num1[] = scanner.next().split("");
        String num2[] = scanner.next().split("");

        for (int i=0; i<num1.length; i++) {
            if (num1[i].equals(num2[i])) {
                System.out.print(0);
            }
            else {
                System.out.print(1);
            }
        }

    }
}
