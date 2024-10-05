import java.util.Scanner;

public class CandyCaneFeast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long cowHeights[] = new long[N];
        long caneHeights[] = new long[M];

        for (int i=0; i<N; i++) {
            cowHeights[i] = scanner.nextLong();
        }

        for (int i=0; i<M; i++) {
            caneHeights[i] = scanner.nextLong();
        }

        // go through canes
        for (int i=0; i<M; i++) {
            long caneEaten = 0;
            // go through all cows
            for (int j=0; j<N; j++) {

                long currentCowEats = Math.min(caneHeights[i], cowHeights[j]) - caneEaten;

                if (currentCowEats > 0) {
                    caneEaten += currentCowEats;
                    cowHeights[j] += currentCowEats;
                }

                if (caneEaten == caneHeights[i]) {
                    break;
                }

            }

        }

        for (int i=0; i<N; i++) {
            System.out.println(cowHeights[i]);
        }


    }
}
