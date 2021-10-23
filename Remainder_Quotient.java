import java.util.*;
public class Remainder_Quotient {
    public static void main(String[] args){             //main function
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Dividend");       //Taking Dividend from user
        int div = sc.nextInt();

        System.out.println("Enter the Divisor ");       //Taking Divisor from user
        int divi = sc.nextInt();

        int quotient = div/divi;                        //Caluculating quotient
        int remainder = div%divi;                       //Caluculating remainder

        System.out.println("The Quotient is "+ quotient);
        System.out.println("The Remainder is "+remainder);
    }
}
