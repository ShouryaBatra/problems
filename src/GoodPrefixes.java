import java.util.Scanner;

public class GoodPrefixes {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largestNumber = 0;
        int countSum = 0;

        for (int i=0; i<n; i++) {


            countSum = countSum + arr[i];
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }

        }

        if (largestNumber == (countSum - largestNumber)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }




    }
}
