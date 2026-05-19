public class Rainfall
{
    // Stores 3 years of rainfall data
    private double[][] rainfall;

    // Stores the months
    private String[] months = {"January", "February", "March", "April",  "May", "June", "July", "August",  "September", "October", "November", "December"};

    // Default Constructor
    public Rainfall()
    {
        rainfall = new double[3][12];
    }

    // Constructor with data
    public Rainfall(double[][] rainfallData)
    {
        setRainfall(rainfallData);
    }

    public void setRainfall(double[][] rainfallData)
    {
        for (int year = 0; year < rainfallData.length; year++)
        {
            for (int month = 0; month < rainfallData[i].length; month++)
                {
                rainfall[year][month] = rainfallData[year][month];
                }
        }
    }

    public double getRainfallAmount(int year, int month)
    {
        return rainfall[year][month]
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
        return totalMonths / 3.0;
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

    public double getYearWithMostRain()
    {

    }

    public double getYearWithLeastRain()
    {

    }

    public double getMonthWithMostRain(int year)
    {

    }

    public double getMonthWithLeastRain(int year)
    {

    }

    public d






}