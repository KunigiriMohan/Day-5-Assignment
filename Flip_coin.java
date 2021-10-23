import java.util.*;
import java.util.Random;
public class Flip_coin {
    public static void main(String[] args){
        int i;                                                      //intialising variables
        int temp = 0;
        int temp1 = 0;

        Random r = new Random();                                    //Taking random function for flipping coin
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of times coins to be flipped");
        int num = sc.nextInt();                                     //Taking input from user for how many times we need to flip a coin

        for(i=1;i<=num;i++) {
            int flip = r.nextInt(2);
            if (flip <= 0.5) {
                temp = temp+1;
                System.out.println("You got Heads");
            } else {
                System.out.println("You got Tails");
                temp1 = temp1+1;
            }
        }

        System.out.println();                                          //print how many no of heads and tails got
        System.out.println("No of Heads got: "+temp);
        System.out.println("No of tails got: "+temp1);


        float percent1 = ((float) temp)/((float) num)*100;          //caluculating percentage of heads and tails got
        float percent2 = ((float) temp1)/((float) num)*100;

                System.out.println();
                System.out.println("Percentage of Heads got: "+percent1+"%");
                System.out.println("Percentage of Tails got: "+percent2+"%");
    }
}
