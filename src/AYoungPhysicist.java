import java.util.Scanner;

public class AYoungPhysicist {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create scanner object
        int N = input.nextInt(); // wait for user to enter something

        int i = 0;
        int xCount = 0;
        int yCount = 0;
        int zCount = 0;
        while (i < N) {
            xCount = xCount + input.nextInt();
            yCount = yCount + input.nextInt();
            zCount = zCount + input.nextInt();
            i++;
        }

        if (xCount == 0 && yCount == 0 && zCount == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
