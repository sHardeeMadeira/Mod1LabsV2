package madeira.cs;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int teenager = 16;
        int adult = 35;

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = myscanner.nextInt();

        if (age < teenager) {
            System.out.println("Sorry, no fun for you :(");
        }
        if (age == teenager) {
            System.out.println("You can drive and get a tattoo! Have fun! But no being president.");
        }
        if (age == adult) {
            System.out.println("Go run for president if you want! But please don't have questionable morals.");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth month (1-12): ");
        int month = input.nextInt();

        if (month == 1) {
            System.out.println("You are a Aquarius and born in winter. There are 31 days in your month.");
        }
        if (month == 2) {
            System.out.println("You are a Pisces and born in winter. There are 28 days however your month is special because 4 years there are 29 days.");
        }
        if (month == 3) {
            System.out.println("You are a Aries and born in spring. There are 31 days in your month.");
        }
        if (month == 4) {
            System.out.println("You are a Taurus and born in spring. There are 30 days in your month.");
        }
        if (month == 5) {
            System.out.println("You are a Gemini and born in spring. There are 31 days in your month.");
        }
        if (month == 6) {
            System.out.println("You are a Cancer and born in summer. There are 30 days in your month.");
        }
        if (month == 7) {
            System.out.println("You are a Leo and born in summer. There are 31 days in your month.");
        }
        if (month == 8) {
            System.out.println("You are a Virgo and born in summer. There are 31 days in your month.");
        }
        if (month == 9) {
            System.out.println("You are Libra and born in fall. There are 30 days in your month.");
        }
        if (month == 10) {
            System.out.println("You are a Scorpio and born in fall. There are 31 days in your month.");
        }
        if (month == 11) {
            System.out.println("You are a Sagittarius and born in fall. There are 30 days in your month.");
        }
        if (month == 12) {
            System.out.println("You are a Capricorn and born in winter. There are 31 days in your month.");
        }

        Scanner scanner = new Scanner(System.in);

        int birthyear;
        int dayofbirth;
        int birthmonth = 0;
        int day2;
        int year2;
        int month2;

        System.out.println("Let's calculate your age,");

         {
            System.out.print("Enter the year you were born: ");
            birthyear = scanner.nextInt();
        } while (birthyear < 1000 || birthyear > 2020);


         {
            System.out.print("Enter the month you were born: ");
            birthmonth = scanner.nextInt();
        } while (birthmonth < 1 || birthmonth > 12);


         {
            System.out.print("Enter the day you were born: ");
            dayofbirth = scanner.nextInt();
        } while (dayofbirth < 1 || dayofbirth > 31);



         {
            System.out.print("Enter today's year: ");
            year2 = scanner.nextInt();
        } while (year2 < 1000 || year2 > 2020);


         {
            System.out.print("Enter today's month: ");
            month2 = scanner.nextInt();
        } while (month2 < 1 || month2 > 12);


         {
            System.out.print("Enter today: ");
            day2 = scanner.nextInt();
        } while (day2 < 1 || day2 > 31);


        int year_leap;
        int[] month_day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (birthyear % 4 == 0 && birthyear % 100 != 0 || birthyear % 400 == 0) {
            year_leap = 366;
            month_day[1] = 29;
        } else {
            month_day[1] = 28;
            year_leap = 365;
        }


        int userYear = 0;
        int userMonth;
        int userDay;

        if (birthyear <= year2) {
            userYear = year2 - birthyear;
        } else System.out.printf("Error!!! %n");

        if (month > month2) {
            userYear--;
            userMonth = month2 + 12 - month;
        } else userMonth = month2 - month;

        if (dayofbirth > day2) {
            userMonth--;
            userDay = day2 + month_day[userMonth] - dayofbirth;
        } else userDay = day2 - dayofbirth;


        int day_year = 0;
        int day_month = 0;
        int day_age = 0;


        while (birthyear < year2 - 1) {

            if (birthyear % 4 == 0 && birthyear % 100 != 0 || birthyear % 400 == 0) {
                year_leap = 366;
                month_day[1] = 29;
            } else {
                year_leap = 365;
                month_day[1] = 28;

            }
            birthyear++;
            day_year = day_year + year_leap;
        }

        day_month = month_day[1] * userMonth + userDay;
        day_age = day_year + day_month;


        System.out.println("Here's your exact age (year,month,day):  " + userYear + "." + userMonth + "." + userDay);
        System.out.println("Now here's how old you are in days: " + day_age);



        System.out.println("Good bye!");

    }
}































