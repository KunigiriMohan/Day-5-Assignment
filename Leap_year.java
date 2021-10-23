
import java.util.*;
public class Leap_year {
        public static boolean leapYearCheaker(int year)             // leapYearCheaker method for checking given method is leap year or not
        {
            if(year>1000)
            {
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                {
                    return true;
                }
                else{
                    return false;
                }
            }
            System.out.println("Enter a year greater than 1000");
            return false;
        }

        public static void main(String[] args)                      //main function
        {
            Scanner u = new Scanner(System.in);

            System.out.println("Enter a leap year:");                  //taking inputs from user
            int year=u.nextInt();
            boolean result = leapYearCheaker(year);

            if(result)                                          //if function for checking return from method leapYearchecker
            {
                System.out.println("Year:"+ year + " is a leap year");
            }
            else
            {
                System.out.println("Year: "+ year + " is not a leap year");
            }
        }
}
