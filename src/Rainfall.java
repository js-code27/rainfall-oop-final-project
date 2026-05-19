public class Rainfall
{
    // Stores 3 years of rainfall data
    private double[][] rainfall;

    // Stores the months
    private String[] months = {"January", "February", "March", "April",  "May", "June", "July", "August",  "September", "October", "November", "December"};

    // Constructor
    public Rainfall(double[][] rainfallData)
    {
        setRainfall(rainfallData);
    }

    public void setRainfall(double[][] rainfallData)
    {
      rainfall = new double[3][12];

        for (int year = 0; year < rainfallData.length; year++)
        {
            for (int month = 0; month < rainfallData[year].length; month++)
                {
                rainfall[year][month] = rainfallData[year][month];
                }
        }
    }

    // gets specific rain value arrays for a selected year or month
    public double getRainfallAmount(int year, int month)
    {
        return rainfall[year][month];
    }

    // gets the months name
    public String getMonthName(int month)
    {
        return months[month];
    }

    // gets the total rain fall of the three years combined
    public double getThreeYearRainfallAmount()
    {
        double total = 0;

        for (int year = 0; year < rainfall.length; year++)
        {
            for (int month = 0; month < rainfall[year].length; month++)
            {
                total += rainfall[year][month];
            }
        }

        return total;
    }

    // gets the average monthly rainfall of the three years combined
    public double getThreeYearAverageMonthlyRainfall()
    {
        int totalMonths = rainfall.length * rainfall[0].length;
        return getThreeYearRainfallAmount() / totalMonths;
    }

    // gets the total rainfall of a specific year
    public double getTotalRainfallForEachYear(int year)
    {
        int yearIndex = year - 1;
        double total = 0;

        for (int month = 0; month < rainfall[yearIndex].length; month++)
        {
            total += rainfall[yearIndex][month];
        }

        return total;
    }

    // gets the number of the year with the most rain
    public int getYearWithMostRain()
    {
        int yearWithMostRain = 1;
        double highestRainfall = getTotalRainfallForEachYear(1);
        double currentTotal;

        for (int year = 2; year <= rainfall.length; year++)
        {
            currentTotal = getTotalRainfallForEachYear(year);

            if (currentTotal > highestRainfall)
            {
                highestRainfall = currentTotal;
                yearWithMostRain = year;
            }
        }

        return yearWithMostRain;
    }

    // gets the number of the year with the least rain
    public int getYearWithLeastRain()
    {
        int yearWithLeastRain = 1;
        double lowestRainfall = getTotalRainfallForEachYear(1);
        double currentTotal;

        for (int year = 2; year <= rainfall.length; year++)
        {
            currentTotal = getTotalRainfallForEachYear(year);

            if (currentTotal < lowestRainfall)
            {
                lowestRainfall = currentTotal;
                yearWithLeastRain = year;
            }
        }

        return yearWithLeastRain;
    }

    // gets the name of the month with the most rain of a year specified by a user
    public String getMonthWithMostRain(int selectedYearNum)
    {
        int yearIndex = selectedYearNum - 1;
        int monthWithMostRain = 0;
        double highestRainfall = rainfall[yearIndex][0];

        for (int month = 1; month < rainfall[yearIndex].length; month++)
        {
            if (rainfall[yearIndex][month] > highestRainfall)
            {
                highestRainfall = rainfall[yearIndex][month];
                monthWithMostRain = month;
            }
        }

        return months[monthWithMostRain];
    }

    // gets the name of the month with the least rain of a specified year by a user
    public String getMonthWithLeastRain(int selectedYear)
    {
        int yearIndex = selectedYear - 1;
        int monthWithLeastRain = 0;
        double lowestRainfall = rainfall[yearIndex][0];

        for (int month = 0; month < rainfall[yearIndex].length; month++)
        {
            if (lowestRainfall > rainfall[yearIndex][month])
            {
                lowestRainfall = rainfall[yearIndex][month];
                monthWithLeastRain = month;
            }
        }

        return months[monthWithLeastRain];
    }

    // gets the value of the year that had the most rain
    public double getMostRainInYear(int selectedYear)
    {
        int yearIndex = selectedYear - 1;
        double highestRainfall = rainfall[yearIndex][0];

        for (int month = 1; month < rainfall[yearIndex].length; month++)
        {
            if (rainfall[yearIndex][month] > highestRainfall)
            {
                highestRainfall = rainfall[yearIndex][month];
            }
        }

        return highestRainfall;
    }

    // gets the value of the year that had the least rain
    public double getLeastRainInYear(int selectedYear)
    {
        int yearIndex = selectedYear - 1;
        double lowestRainfall = rainfall[yearIndex][0];

        for (int month = 1; month < rainfall[yearIndex].length; month++)
        {
            if (rainfall[yearIndex][month] < lowestRainfall)
            {
                lowestRainfall = rainfall[yearIndex][month];
            }
        }

        return lowestRainfall;
    }

    // display the entire rain data
    public void displayRainfallTable()
    {
        System.out.println("\nRainfall Data");

        for (int year = 0; year < rainfall.length; year++)
        {
            System.out.println("\nYear " + (year + 1) + ":");

            for (int month = 0; month < rainfall[year].length; month++)
            {
                System.out.println(months[month] + ": " + rainfall[year][month] + " inches");
            }
        }
    }

}