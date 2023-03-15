import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Alistirma_Grocery {

    //
    //Task://Write a programs of a grocery store that shows all the  7 day earning of the store on a daily basis.

    //    //also write a method that shows the average amounth the store earns this week.
    //    //also write a method that shows which days the store earns above the average.
    //    //also write a method that shows which days the store earns below the average.
    //
    //    // step 1:Create an Array Containing the days (Days) Ahmet
    static ArrayList<String> Days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    //    //step 2:Create an ArraysList which we will add the daily earnings.emine
    static ArrayList<Integer> Dailyearnings = new ArrayList<>();

    //    // step 3:use the whileloop and take the 7 day earnings from the user,one by one and add them to the daily earnings ArrayList. Suzan
    static Scanner scan = new Scanner(System.in);
    static int weeklyEarning = 0;

    public static void main(String[] args) {
        System.out.println("***************** WELCOME *************");


        int day = 0;
        while (day < 7) {
            System.out.println("Enter your daily earnings");
            int earnings = scan.nextInt();
           Dailyearnings.add(earnings);
            weeklyEarning +=earnings;
            day++;
        }
        //    //step 4:get the average earning with the method called getAverageEarnings().   Ahmet
        System.out.println("getAverageEarnings() = " + getAverageEarnings());
        //    //step 5:Create a method called getOrtalamaninUstundeKazancGünleri(),    Emine
        //    //     Compare all days with average earnings with for loop
        //    //      If higher than average earnings, return those days.
        System.out.println("getoveraverageearning() = " + getoveraverageearning());

        //    //step 6:Create a method called getUnderAverageEarningDays().     Suzan
        //    //     Compare all days with average earnings with for loop
        //    //      If less than average earnings, return those days.
    }

    private static int getAverageEarnings() {
        int Average=weeklyEarning/7;
        return Average;

    }

    private static String  getoveraverageearning() {
        String overaverage=" ";
        for (int i = 0; i <Dailyearnings.size() ; i++) {
            if (Dailyearnings.get(i)>getAverageEarnings()){
                overaverage+=Days.get(i) + " ";

            }

        }
        return overaverage;
    }












}
