import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bear extends Animal {
    // Create a static member variable that accumulates the number of hyenas created.
    private static int numOfBears = 0;



    // Create an ArrayList to store the split values read from animalNames.txt
    private static List<String> myListOfBearNames = new ArrayList<>();



    // write a Getter method to look at the static int of numOfBears
    public static int getNumOfBears() {
        return numOfBears;

    }

    // Create a constructor that will increment numOfHyenas when a new hyena object is created.
    public Bear() {
        System.out.println("\n A new Bear object was created!!!");
        numOfBears++;
    }

    // Create a method that input hyena names from a file named: animalNames.txt
    public static void inputBearNames() {
        // Define the file path
        String filePath = "C:\Users\BE218\Downloads\animalNames.txt";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
             Scanner scanner = new Scanner(System.in)){
            String line;
            int lineNum = 1;
            while ((line = fileReader.readLine()) != null) {

            }

            // Create an id for our new animal

            String theNewID = Main.genUniqueID("bear", 8);

            System.out.println()

        }

        // write a Getter method.
        public int getNumOfBears;



        public static void

        // pop one name off the list


    }




}


}
















































    // output the list.
    public static void listOut() {
        for (String name : myListOfHyenaNames) {
            System.out.println(name);

        }
    }

    //pop one name off the list
    public static String popHyenaName() {
        // Remove the first element from the ArrayList
        String removedHyenaName = "";
        if (!myListOfHyenaNames.isEmpty()) {
            if ()
        }
    }

}
