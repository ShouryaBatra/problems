import java.util.Scanner;

public class Cupboards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


//
        int leftZeroCount = 0;
        int rightZeroCount = 0;

        for (int i=0; i<n; i++) {


            if (scanner.nextInt() == 0) {
                leftZeroCount++;
            }

            if (scanner.nextInt() == 0) {
                rightZeroCount++;
            }

        }

        int count = 0;

        if (leftZeroCount >= 3) {
            count = count + (5-leftZeroCount);
        }
        else {
            count = count + leftZeroCount;
        }

        if (rightZeroCount >= 3) {
            count = count + (5-rightZeroCount);
        }
        else {
            count = count + rightZeroCount;
        }

        System.out.println(count);


    }
}
