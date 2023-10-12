import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.*;


public class Main {
    public static void main(String[] args) {

        System.out.printf("\n\nWelcome to my Zoo!\n\n");
        Animal myAnimal = new Animal();
        Animal mySecondAnimal = new Animal("some name", "hyena");

        String aName = mySecondAnimal.name;
        System.out.println("\n the animal name is: " + aName);

        // Create a hyena
        Hyena myHyena = new Hyena();

        // Look at the new Hyena object
        System.out.println("\n The hyena name is: " + myHyena.name);

        // Create a hyena with a name and a species
        Hyena aNewHyena = new Hyena("Zig","hyena");

        System.out.println(" \n the name of my hyena is: " + aNewHyena.name);

        // Get today's date
        LocalDate

        String myAnimalBD = ""

        if (birthSeason.contains("spring")) {
            myAnimalBD = "Mar 21, " + animalsYearOfBirthDate;
        }
        else if (birthSeason.contains("fall")) {
            myAnimalBD = "Sep 21, " + animalsYearFoBirthDate;
        }
        else if (birthSeason.contains("unknown")) {
            myAnimalBD = "Jan 1, " + animalsYearFoBirthDate;
        }
        else if (birthSeason.contains("winter")) {
            myAnimalBD = "Sep 21, " + animalsYearFoBirthDate;
        }
        else if (birthSeason.contains("summer")) {
            myAnimalBD = "Jun 21, " + animalsYearFOBirthDate;
        }
        else {
            myAnimalBD = "unable to process" + animalsYearFoBirthDate;
        }

        System.out.println("\n\n Animal birth date is " + myAnimalBD + "\n\n");

        // Subtract 4 years
        calendar.add(Calendar.YEAR, - Integer.parseInt(myArrayOfGnderSpecies[0]) );

        // Get the new date after subtraction
        Date yearsAgo = calendar.getTime();

        // Code up calculating the animal's age
        // Animal age = now - animal birthdate
        // We must create dateTime objects so we can do math on them

        // 1) Create a DateTime for "Jan 1, 2017"
        // this will be the birthdate
       // LocalDate myDate = LocalDate.of(2017, month, day);
        //  this doesn't work
        //LocalDate myDate = localDate.of(myAnimalBD);
        //LocalDate myDate = parseCustomDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");

        LocalDate myBirthdayTest = LocalDate.parse(myAnimalBD, formatter);

        System.out.println("\n myDate is: " + myBirthdayTest);


        // This was the code done in class on Oct 

        // Calculate animal age using local date objects
        LocalDate myNow = LocalDate.now();
        LocalDate myAnimalAge = myBirthdayTest - myNow. ;

        System.out.println("\n The animal's age is: " + myAnimalAge);




        // Print the original and new dates
        System.out.println("Today's Date: " + today);
        System.out.println("Date " + myArrayOfAgeGenderSpecies[1] + " years ago: ");




    }
}