import java.util.*;
public class Power_of_2 {
    public static void main(String[] args) {
        power1();

    }
        static void power1()
        {
         System.out.println("Enter power of 2");
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int i;
         int total = 1;
         for (i=1;i<=number;i++)
            {
             total = total*2;
             System.out.println(" 2 power of "+i+" is "+total);
            }
                 }


}
