import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.next().split("");

        int counter = 0;
        for (int i=0; i<input.length; i++ ) {
            if (input[i].equals("4") || input[i].equals("7")) {
                counter++;
            }
        }

        if (counter==4 || counter==7) {
            System.out.println("YES");

        }
        else {
            System.out.println("NO");
        }
    }
}
