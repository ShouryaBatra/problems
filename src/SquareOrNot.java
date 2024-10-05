import java.util.Scanner;

public class SquareOrNot {

    static boolean isPerfectSquare(int num) {
        int sr = (int)Math.sqrt(num);
        if (sr * sr == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=0; i<t; i++) {

            int n = scanner.nextInt();
            String characters[] = scanner.next().split("");

//			if (isPerfectSquare(n)) {
//				System.out.println(n);
//			}


            if (isPerfectSquare(n)) {

                int sqrt = (int)Math.sqrt(n);
                int amountOfZeros = (sqrt - 2) * (sqrt - 2);

                int charactersLength = characters.length;

                int startIndex = sqrt + 1;
                int endIndex = charactersLength - sqrt - 2;

                boolean itIsWrong = false;


                for (int j=0; j<startIndex; j++) {
                    if (characters[j].equals("0")) {
                        itIsWrong = true;
                        break;
                    }
                }
                if (!itIsWrong) {
                    for (int j=startIndex; j<=endIndex; j++) {
                        if (j % sqrt == 0 || j % sqrt == sqrt - 1) {
                            if (characters[j].equals("0")) {
                                itIsWrong = true;
                                break;
                            }
                        }
                        else if (characters[j].equals("1")) {
                            itIsWrong = true;
                            break;
                        }

                    }
                }

                if (!itIsWrong) {
                    for (int j=endIndex + 1; j<charactersLength; j++) {
                        if (characters[j].equals("0")) {
                            itIsWrong = true;
                            break;
                        }
                    }
                }



                if (itIsWrong) {
                    System.out.println("No");
                }
                else {
                    System.out.println("Yes");
                }

            }
            else {
                System.out.println("No");
            }

        }
    }
}
