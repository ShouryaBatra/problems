import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


//		for (int i=2; i<(num1/2) + 1; i++) {
//			if (num1%i==0) {
//				isPrime = false;
//			}
//		}

        boolean runLoop = true;
        int nextPrime = 0;
        boolean isPrime = false;

        for (int i=num1+1; runLoop == true; i++) {
            if (isPrime == true) {
                nextPrime = i-1;
                runLoop = false;
            }
            isPrime = true;
            for (int j=2; j<(i/2)+1; j++) {


                if (i%j==0) {
                    isPrime = false;
                }
            }
        }

        if (nextPrime == num2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
