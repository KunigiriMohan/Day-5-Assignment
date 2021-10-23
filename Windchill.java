import javax.sound.midi.SysexMessage;
import java.util.*;
import java.lang.Math;
public class Windchill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temparature in farenheit : ");      //Taking input for temparaure from user
        double t = sc.nextInt();
        System.out.println("Enter Wind speed in miles/hour :");       //Taking input for wind speed from user
        double v = sc.nextInt();

        double w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*(Math.pow(v, 0.16))); //caluculating efective tmparature
        System.out.println("Effective temparature to be : "+w);
    }
}
