import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();

        double count = 0;

        for (int i=0; i<n; i++) {
            count = count + (scanner.nextInt()/n);
        }

        System.out.println(count);

    }
}
