import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Main.java
// Driver Class for the Zoo program
// nL
// 9/26/23

import java.sql.SQLOutput;

public class Main {

    // Creating the genUniqueID method
    private static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;


        if (theSpecies.contains("hyena")) {
            prefix = "Hy";
        }

        return prefix + Integer.valueOf(suffix)

    }




    public static void main(String[] args) {

        // Load all species classes with name.
        // Call the static method to create a list of names
        Lion.inputLionNames();
        Tiger.inputTigerNames();
        Bear.inputBearNames();
        Hyena.inputHyenaNames();


        // Open CSV



        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFileLine = reader.readLine()) != null {
                String[] myArray = myFileLine.split(",");

                String myStr = myArray[0];
                System.out.println("\n my Str = " + myStr);
                myArray = myStr.split(" ");
                String mySpecies = myArray[4];
                System.out.println(" Species is: " + mySpecies);
                System.out.println("\n myStr = " + myStr);

                
            }
        }

        // Show the bear names:
        Bear.listOut();


        // Pop a name from the hyena list:
        String myName = Bear.popBearName();
        myName = Bear.popBearName();
        myName = Bear.popBearName();

        System.out.println("\n the popped bear name is: " + myName);


        System.out.println("\n Welcome to my Zoo!!");

        // Look at our animalNames file!
        // call inputHyenaNames()

        Hyena.inputHyenaNames();


        // Create a Hyena object.
        Hyena myNewHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + myNewHyena.getNumOfHyenas());

        Hyena anotherHyena = new Hyena();

        System.out.println("\n Number of Animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of Hyenas: " + anotherHyena.getNumOfHyenas);

        // how many hyenas
        int currentNumOfHyenas = Hyena.getNumOfHyenas();

        // Split the next group of words by a space.
        String[] 

        System.out.println("\n The number pf hyenas is: " + currentNumOfHyenas + "\n\n");

        Hyena oneMore = new Hyena();

        oneMore.setAnimalID("Hy09");

        oneMore.setAnimalColor("yellow spots");

        System.out.println();

        System.out.println("\n The id of oneMore is " + oneMore.getAnimalID());



    }
}
