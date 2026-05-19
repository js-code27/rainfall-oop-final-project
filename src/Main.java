import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Stores the users menu option
        int option;

        // Stores the users selected year
        int selectedYear;

        double[][] rainfallData = {{4.96, 3.27, 1.50, 1.38, 2.28, 2.11, 1.61, 5.93, 4.30, 1.77, 8.72, 3.47}, {1.60, 3.88, 2.22, 10.02, 7.16, 2.74, 5.10, 5.14, 4.91, 6.39, 17.65, 4.30}, {1.81, 1.70, 6.04, 6.25, 4.53, 3.93, 6.66, 7.68, 15.79, 6.61, 10.16, 3.33}};

        // Creats rainfall object with preset data
        Rainfall rainfall = new Rainfall(rainfallData);

        System.out.println("Rainfall Measurement Program");

        do
        {
            switch (option)
            {
                case 1:
                    rainfall.getThreeYearRainfallAmount();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:
                    System.out.println("Good Bye!");
                    break;

                default:
                    System.out.println("Invalid Option, Select a number from 1 to 9");
            }

        } while (option != 9);

    }

    public static void printMenu()
    {
        System.out.println("\nMenu:");
        System.out.println("1. Total rainfall for the three years");
        System.out.println("2. The average monthly rainfall for the three years");
        System.out.println("3. Total rainfall per year");
        System.out.println("4. Year with the most rain");
        System.out.println("5. Year with the least rain");
        System.out.println("6. The month with the most rain in a specific year");
        System.out.println("7. The month with the least rain in a specific year");
        System.out.println("8. Display the Rainfall Table");
        System.out.println("9. Exit");
        System.out.println("\nNOTE: Rain is measured in inches");
    }

    // Acquires and validates the user number option for year selection
    public static int askForYear(Scanner keyboard)
    {
        int year;

        do
        {
            System.out.print("Select from 1-3 for a specific year: ");
            year = keyboard.nextInt();

            if (year < 1 || year > 3)
            {
                System.out.println("Please select year 1, 2, or 3");
            }

        } while (year < 1 || year > 3);

        return year;
    }
}