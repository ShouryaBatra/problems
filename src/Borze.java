import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {

        // input
        Scanner input = new Scanner(System.in);
        String code = input.next();
        String[] codeCharacters = code.split("");

        // go through array
        for (int i = 0; i<codeCharacters.length; i++) {
            if (codeCharacters[i].equals(".")) {
                System.out.print(0);
            }
            else if(codeCharacters[i].equals("-")) {
                if (codeCharacters[i + 1].equals(".")) {
                    System.out.print(1);
                    i++;
                }
                else if(codeCharacters[i + 1].equals("-")) {
                    System.out.print(2);
                    i++;
                }
            }
        }

    }
}
