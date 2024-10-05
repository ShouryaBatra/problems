import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {
            String str1[] = scanner.next().split("");
            String str2[] = scanner.next().split("");

            String temp = str1[0];
            str1[0] = str2[0];
            str2[0] = temp;

            for (int j=0; j<str1.length; j++) {
                System.out.print(str1[j]);
            }
            System.out.print(" ");
            for (int j=0; j<str2.length; j++) {
                System.out.print(str2[j]);
            }

            if (i != t-1) {
                System.out.println();
            }

        }



    }
}
