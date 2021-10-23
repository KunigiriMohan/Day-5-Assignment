import java.lang.Math;
import java.util.*;
public class Distance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x value ");           //taking input x
        double x =sc.nextInt();
        System.out.println("Enter y value ");           //taking input y
        double y = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x,x)+Math.pow(y,y));       //caluculating distance of point from origin
        System.out.println("Distance between point to origin : "+distance);
    }
}
