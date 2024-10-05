import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // create grid
        int grid[][] = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // create answer grid
        int answerGrid[][] = new int[3][3];


        // go through grid
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (grid[i][j] != 0) { // checks if number is greater than 0
                    if (grid[i][j] % 2 == 1) { // check if number is odd
                        answerGrid[i][j]++;
                        if (i != 2) {
                            answerGrid[i+1][j]++;
                        }
                        if (i != 0) {
                            answerGrid[i-1][j]++;
                        }
                        if (j != 2) {
                            answerGrid[i][j+1]++;
                        }
                        if (j != 0) {
                            answerGrid[i][j-1]++;
                        }
                    }
                }
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (answerGrid[i][j] % 2 == 1) {
                    answerGrid[i][j] = 0;
                }
                else {
                    answerGrid[i][j] = 1;
                }
            }
        }

        for (int i=0; i<3; i++) {
            if (i != 0) {
                System.out.println();
            }
            for (int j=0; j<3; j++) {
                System.out.print(answerGrid[i][j]);
            }
        }



    }
}
