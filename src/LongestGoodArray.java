import java.util.Scanner;

public class LongestGoodArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {

            int l = scanner.nextInt();
            int r = scanner.nextInt();

            System.out.println((int)(1 + Math.sqrt((8 * l) - (8 * r) + 1)) / 2);

        }


    }
}

