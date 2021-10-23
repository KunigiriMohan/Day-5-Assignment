import java.util.*;
public class Even_odd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find Even or not ");      // Taking input from user
        int num = sc.nextInt();

        if(num%2 == 0){                                                 //Checking Whether number is even or odd
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
