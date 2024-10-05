import java.util.Scanner;

public class MixingMilk {
    public static void main(String[] args) {

        int arr[][] = new int[100][3];

        int capacities[] = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++)  {
            capacities[i] = scanner.nextInt();
            arr[0][i] = scanner.nextInt();
        }

        for (int i=0; i<3; i++) {
            System.out.println(capacities[i]);
            System.out.println(arr[0][i]);
        }


    }
}
