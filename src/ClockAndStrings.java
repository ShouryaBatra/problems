import java.util.Scanner;

public class ClockAndStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt(); // input a and b
            if (b<a) { // sort a is less than be
                int temp = a;
                a = b;
                b = temp;
            }
            int c = scanner.nextInt();
            int d = scanner.nextInt(); // input c and d

            if (d<c) { // sort c is less than d
                int temp = c;
                c = d;
                d = temp;
            }

            if ((a < c && c < b && b < d) || (a > c && b > d && a < d)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }

    }
}



// yes          (a < c && c < b && b < d) || (a > c && b > d && a > d)
// 2 9 6 10
// 3 5 4 12
// 7 12 6 9
//
//
//
//
//
//
//
//
//
