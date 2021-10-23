import java.util.*;
public class Swaping_numbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number : ");        //Taking first input from user
        int first = sc.nextInt();

        System.out.println("Enter the Second Number : ");       //Taking second input from user
        int second = sc.nextInt();

        System.out.println();

        System.out.println("Before Swaping ");                  //Printing numbers before swaping
        System.out.println("First number : "+first);
        System.out.println("Second number : "+second);

        int temp = second;                                      //Swaping the numbers
        second = first;
        first = temp;

        System.out.println();

        System.out.println("After Swaping ");                   //Printing numbers afters swaping
        System.out.println("First number : "+first);
        System.out.println("Second number : "+second);
    }
}
