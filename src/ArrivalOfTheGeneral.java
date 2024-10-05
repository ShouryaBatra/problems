import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int soldiers[] = new int[n];
        int smallestNumberIndex = 0;
        int largestNumberIndex = 0;

        int smallestNumber = 101;
        int largestNumber = 0;

        for (int i=0; i<n; i++) {


            int currentNum = scanner.nextInt();
            soldiers[i] = currentNum;

            if (currentNum <= smallestNumber) {
                smallestNumber = currentNum;
                smallestNumberIndex = i;
            }

            if (currentNum > largestNumber) {
                largestNumber = currentNum;
                largestNumberIndex = i;
            }

        }


        if (smallestNumberIndex < largestNumberIndex) {
            System.out.println(largestNumberIndex + (n - smallestNumberIndex - 1) - 1);

        }

        else {
            System.out.println(largestNumberIndex + (n - smallestNumberIndex - 1));
        }

    }
}
