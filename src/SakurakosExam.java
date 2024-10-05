import java.util.Scanner;

public class SakurakosExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a % 2 == 1) {
                System.out.println("NO");
            }

            else if (a <= (b * 2) + 1) {

                int groupsOfTwoA = (int)a/2;

                int newB = b - groupsOfTwoA;
                int newA = a - (groupsOfTwoA * 2);

                if (newB % 2 == 0) {
                    System.out.println("YES");
                }
                else if(a >= 4){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
                System.out.println(newA);
                System.out.println(newB);

            }

            else {

                System.out.println(a);
                System.out.println(b);

            }






        }

    }
}
