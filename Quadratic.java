import java.lang.Math;
import java.util.*;
public class Quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of Quadratic Equation");        //Taking a,b,c values from user
        double a = sc.nextInt();
        System.out.print("Enter b value of Quadratic Equation");
        double b = sc.nextInt();
        System.out.print("Enter c value of Quadratic Equation");
        double c = sc.nextInt();

        double delta = Math.pow(b,b)-4*a*c;                 //Caluculating delta , root1, root2 values
        double root1 = (-b+Math.sqrt(delta))/(2*a);
        double root2 = (b+Math.sqrt(delta))/(2*a);

        System.out.println("The delta of the Equation is "+delta);  //Printing delta , root1, root2 values
        System.out.println("The first root of equation is "+root1);
        System.out.println("The second root of Equation is "+root2);




    }
}
