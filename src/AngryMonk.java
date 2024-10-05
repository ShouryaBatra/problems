import java.util.Scanner;

public class AngryMonk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i=0; i<t; i++) {


            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[k];

            int largestNumber = 0;
            int oneCount = 0;

            for (int j=0; j<k; j++) {

                int current = scanner.nextInt();
                arr[j] = current;

                if (current > largestNumber) {
                    largestNumber = current;
                }

                if (current == 1) {
                    oneCount++;
                }

            }

            System.out.println( (oneCount) + (n-largestNumber-oneCount) + ( (n-largestNumber-oneCount) - (k-1-oneCount) ) );



        }
    }
}
