import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int dragons[] = new int[d];
        int count = 0;

        for (int i=k-1; i<d; i=i+k) {
            if (dragons[i] == 0) {
                dragons[i] = 1;
                count++;
            }
        }

        for (int i=l-1; i<d; i=i+l) {
            if (dragons[i] == 0) {
                dragons[i] = 1;
                count++;
            }
        }

        for (int i=m-1; i<d; i=i+m) {
            if (dragons[i] == 0) {
                dragons[i] = 1;
                count++;
            }
        }

        for (int i=n-1; i<d; i=i+n) {
            if (dragons[i] == 0) {
                dragons[i] = 1;
                count++;
            }
        }

        System.out.println(count);

//		for (int i=0; i<d; i++) {
//			System.out.print(dragons[i]);
//		}

    }
}
