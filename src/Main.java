public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int option;

        int selectedYear

        do
        {

        }

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

    public static int askForYear(Scanner keyboard)
    {
        int year;

        do
        {
            System.out.print("Select a number that corresponds to the year you want: ");
            year = keyboard.nextInt();

            if (year < 1 || year > 3)
            {
                System.out.println("Please select year 1, 2, or 3");
            }

        } while (year < 1 || year > 3)

    }
}