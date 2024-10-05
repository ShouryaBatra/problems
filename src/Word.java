import java.util.Scanner;

public class Word {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String arr[] = scanner.next().split("");

        int countUpperCase = 0;

        for (int i=0; i<arr.length; i++) {

            char current = arr[i].charAt(0);

            if (Character.isUpperCase(current)) {
                countUpperCase++;
            }

        }

        char answerArr[] = new char[arr.length];

        // more lower case
        if (arr.length - countUpperCase >= countUpperCase) {
            for (int i=0; i<arr.length; i++) {
                char current = arr[i].charAt(0);
                answerArr[i] = Character.toLowerCase(current);

            }
        }

        // more upper case
        if (arr.length - countUpperCase < countUpperCase) {
            for (int i=0; i<arr.length; i++) {
                char current = arr[i].charAt(0);
                answerArr[i] = Character.toUpperCase(current);

            }
        }

        // output
        for (int i=0; i<answerArr.length; i++) {
            System.out.print(answerArr[i]);
        }

    }
}
