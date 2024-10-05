import java.util.Scanner;


public class DifferentString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int j=0; j<T; j++) {
            String input[] = scanner.next().split("");
            boolean isPossible = false;

            for (int i=1; i<input.length; i++) {
                if (!input[0].equals(input[i])) { // checks if characters are not equal

                    String indexZero = input[0];
                    input[0] = input[i];          // replace two characters
                    input[i] = indexZero;

                    isPossible = true;
                    break;

                }
            }


            if (isPossible == true) {
                System.out.println("YES");
                for (int i=0; i<input.length; i++) {
                    System.out.print(input[i]);    // prints the string
                }
                if (j != T-1) {
                    System.out.println();
                }
            }
            else {
                System.out.println("NO");
            }



        }




    }
}
