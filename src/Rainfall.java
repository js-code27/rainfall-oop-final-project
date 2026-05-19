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

    public double getRainfallAmount(int year, int month)
    {
        return rainfall[year][month];
    }

    public String getMonthName(int month)
    {
        return months[month];
    }

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

    public double getThreeYearAverageMonthlyRainfall()
    {
        int totalMonths = rainfall.length * rainfall[0].length;
        return getThreeYearRainfallAmount() / totalMonths;
    }

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