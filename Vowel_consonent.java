import java.util.Scanner;

public class Vowel_consonent {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Charecter");                //Taking input from user
        char c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){      //Checking Whether input is a vowel or not
            System.out.println("The Charecter is a Vowel ");
        }
        else{
            System.out.println("The Charecter is a Consonent");
        }
    }
}
