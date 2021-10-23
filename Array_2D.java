import java.util.*;
public class Array_2D {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of rows in Array");        // Taking inputs from user regarding no of rows and columns
        int a = sc.nextInt();
        System.out.println("Enter No of columns in Arrays");
        int b = sc.nextInt();

        int[][] array = new int[a][b];                          //Inserting elements in a array
        for (int i=0;i<=array.length-1;i++){
            for(int j=0;j<=array[i].length-1;j++){
                System.out.println("Enter "+(i+1)+" row "+(j+1)+" Column Element");
                array[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<=array.length-1;i++){                            //Printing values in a array
            for(int j=0;j<=array[i].length-1;j++){
                System.out.print(array[i][j]+"   ");
            }
            System.out.println();
        }
    }
}