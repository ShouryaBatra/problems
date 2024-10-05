import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {

        // inputs
        Scanner intInput = new Scanner(System.in);
//		Scanner stringInput = new Scanner(System.in);
        int N = intInput.nextInt();
        int T = intInput.nextInt();
        String str = intInput.next();

        // make array
        String[] characters = str.split("");


        for (int j=0; j<T; j++) { 	// run loop T times

            for (int i=0; i<characters.length; i++) { 	// go through characters array

                if (characters[i].equals("B") && i != N-1 && characters[i+1].equals("G")) {
                    characters[i] = "G";
                    characters[i+1] = "B";
                    i++;
                }
            }
        }

        for (int i=0; i<characters.length; i++) {
            System.out.print(characters[i]);
        }


    }
}
