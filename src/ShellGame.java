import java.util.ArrayList;
import java.util.Scanner;

public class ShellGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//		int n = scanner.nextInt();
//
//		int[] shells = {0, 1, 2};
//
//		int[] countPos = new int[3];
//
//
//		for (int i=0; i<3; i++) {
//
//			int a = scanner.nextInt() - 1;
//			int b = scanner.nextInt() - 1;
//			int g = scanner.nextInt() - 1;
//
//			int temp = shells[a];
//			shells[a] = shells[b];
//			shells[b] = temp;
//
//			for (int j=0; j<3; j++) {
//				if (shells[g] == j) {
//					countPos[j]++;
//				}
//			}
//		}
//
//		int largestNumber = countPos[0];
//		for (int i=1; i<3; i++) {
//			if (countPos[i] > largestNumber) {
//				largestNumber = countPos[i];
//			}
//		}
//
//		System.out.println(largestNumber);





        int n = scanner.nextInt();

        int[] shellAtPos = new int[3];
        for (int i = 0; i < 3; i++) { shellAtPos[i] = i; }

        int[] counter = new int[3];

        for (int i = 2; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int g = scanner.nextInt() - 1;

            int temp = shellAtPos[b];
            shellAtPos[b] = shellAtPos[a];
            shellAtPos[a] = temp;

            counter[shellAtPos[g]]++;
        }

        System.out.println(Math.max(counter[0], Math.max(counter[1], counter[2])));

    }
}
