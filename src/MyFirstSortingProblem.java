import java.util.Scanner;

public class MyFirstSortingProblem {
    public static void main(String[] args) {

        // input t
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i=0; i<t; i++) {

            // input x and y
            int x = input.nextInt();
            int y = input.nextInt();

            // output if x <= y
            if (x <= y) {
                System.out.println(x + " " + y);
            }

            // output if y <= x
            else {
                System.out.println(y + " " + x);
            }

        }

    }
}
