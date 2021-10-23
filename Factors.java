import java.util.*;
public class Factors {
    static void primeFactors(int n) {           //primeFactors method Created for caluculating prime factors
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number for which we need find Prime Factors");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                               //Taking inputs from User
        System.out.println("The Prime factors of " + n + " are : ");
        primeFactors(n);
    }
}

