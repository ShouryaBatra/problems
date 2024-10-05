import java.util.Scanner;

public class ABeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int onePosition = 0;
        for(int i = 0; i < 25; i++) {
            if (input.nextInt() == 1) {
                onePosition = i + 1;
                break;
            }
        }


        int i = ((int) (onePosition/5) + 1);
        if (onePosition==5||onePosition==10||onePosition==15||onePosition==20||onePosition==25) {
            i--;
        }
//		System.out.println(onePosition);
//		System.out.println(i);

        int j = onePosition - (((int) (onePosition/5))*5);
        if (j==0) {
            j = 5;
        }
//		System.out.println(j);

        System.out.println(Math.abs(i - 3) + Math.abs(j - 3));
    }
}
