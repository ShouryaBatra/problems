import java.util.Scanner;

public class WordCapitilization {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.next().split("");

        System.out.print(Character.toUpperCase(input[0].charAt(0)));
        for (int i=1; i<input.length; i++) {
            System.out.print(input[i]);
        }

    }
}
