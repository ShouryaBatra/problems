import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String input[] = scanner.next().split("");

        int counter = 0;
        for (int i=0; i<N-1; i++) {
            if (input[i].equals(input[i+1])) {
                input[i] = "X";
                counter++;

            }
        }

        System.out.println(counter);

    }
}
