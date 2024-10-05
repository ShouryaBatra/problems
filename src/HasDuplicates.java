import java.util.Scanner;

public class HasDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        String yearList[] = (year + "").split("");

        boolean hasDuplicates = false;

        for (int i=0; i<yearList.length; i++) {
            for (int j=0; j<yearList.length; j++) {
                if ((i != j) && (yearList[i].equals(yearList[j]))) {
                    hasDuplicates = true;
                }
            }
        }

        System.out.println(hasDuplicates);

    }
}
