import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        String yearList[] = (year + "").split("");

        boolean runLoop = true;

        boolean hasDuplicates = false;

        while(runLoop == true) {
            // add one to year every time to check next number
            year++;
            yearList = (year + "").split(""); // split year
            // reset hasDuplicates
            hasDuplicates = false;

            // checks for duplicates
            for (int i=0; i<yearList.length; i++) {
                for (int j=0; j<yearList.length; j++) {
                    if ((i != j) && (yearList[i].equals(yearList[j]))) {
                        hasDuplicates = true;
                    }
                }
            }

            //outputs the year when it doesn't have duplicates
            if (hasDuplicates == false) {
                System.out.println(year);
                runLoop = false;
            }

        }


    }
}
