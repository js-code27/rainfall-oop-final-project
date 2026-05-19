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

        // Double array of preset rainfall data
        double[][] rainfallData = {{4.96, 3.27, 1.50, 1.38, 2.28, 2.11, 1.61, 5.93, 4.30, 1.77, 8.72, 3.47}, {1.60, 3.88, 2.22, 10.02, 7.16, 2.74, 5.10, 5.14, 4.91, 6.39, 17.65, 4.30}, {1.81, 1.70, 6.04, 6.25, 4.53, 3.93, 6.66, 7.68, 15.79, 6.61, 10.16, 3.33}};

        // Creats rainfall object with preset data
        Rainfall rainfall = new Rainfall(rainfallData);

        System.out.println("Rainfall Measurement Program");

        // Switch case with loop to select menu options
        do
        {
            printMenu();

            System.out.print("Select an option: ");
            option = input.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Total rainfall for the years: " + rainfall.getThreeYearRainfallAmount() + " inches");
                    break;

                case 2:
                    System.out.println("Average monthly rainfall for the three years: " + rainfall.getThreeYearAverageMonthlyRainfall() + " inches");
                    break;

                case 3:
                    System.out.println("Year 1 total rainfall: " + rainfall.getTotalRainfallForEachYear(1) + " inches");

                    System.out.println("Year 2 total rainfall: " + rainfall.getTotalRainfallForEachYear(2) + " inches");

                    System.out.println("Year 3 total rainfall: " + rainfall.getTotalRainfallForEachYear(3) + " inches");
                    break;

                case 4:
                    int mostRainYear = rainfall.getYearWithMostRain();

                    System.out.println("Year with the most rain: Year " + mostRainYear);
                    System.out.println("Rainfall amount: " + rainfall.getTotalRainfallForEachYear(mostRainYear) + " inches");
                    break;

                case 5:
                    int leastRainYear = rainfall.getYearWithLeastRain();

                    System.out.println("Year with the least rain: Year " + leastRainYear);
                    System.out.println("Rainfall amount: " + rainfall.getTotalRainfallForEachYear(leastRainYear) + " inches");
                    break;

                case 6:
                    selectedYear = askForYear(input);

                    System.out.println("Month with the most rain in Year " + selectedYear + ": " + rainfall.getMonthWithMostRain(selectedYear));

                    System.out.println("Rainfall amount: " + rainfall.getMostRainInYear(selectedYear) + " inches");

                    break;

                case 7:
                    selectedYear = askForYear(input);

                    System.out.println("Month with the least rain in Year " + selectedYear + ": " + rainfall.getMonthWithLeastRain(selectedYear));

                    System.out.println("Rainfall amount: " + rainfall.getLeastRainInYear(selectedYear) + " inches");

                    break;

                case 8:
                    rainfall.displayRainfallTable();
                    break;

                case 9:
                    System.out.println("Good Bye!");
                    break;

                default:
                    System.out.println("Invalid Option, Select a number from 1 to 9");
            }

        } while (option != 9);

    }

    // Prints menu to terminal
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