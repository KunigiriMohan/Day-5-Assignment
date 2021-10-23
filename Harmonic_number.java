import java.io.*;
import java.util.*;
public class Harmonic_number {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);     //Taking Nth value of the the h=Harmonic Series
        int number = sc.nextInt();
        System.out.println(number+" Harmonic value is  "+harmonic(number));       //Printing Solution of Programm
    }
        static double harmonic(int number){
            int i;
            double temp=1;
            for (i=2;i<=number;i++) {
                temp+= (float)1/i;
            }
            return temp;
        }
}
