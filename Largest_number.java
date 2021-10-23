import java.util.*;
public class Largest_number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");       //Taking inputs from user
        int a = sc.nextInt();

        System.out.println("Enter the Second Number ");
        int b = sc.nextInt();

        System.out.println("Enter Third number ");
        int c = sc.nextInt();

        if (a >= b && a >= c){                                    //Caluculating which number is big
            System.out.println(a+" is Greater than "+b+" & "+c);
        }
        else if(b >=a && b >=c ) {
            System.out.println(b + " is Greater than " + a +" & "+ c);
        }
        else{
            System.out.println(c + " is Greater than " + a +" & "+ b);
        }
    }
}
