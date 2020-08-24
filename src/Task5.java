import java.util.Scanner;

public class Task5 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2 && num2 > num3 ){
            System.out.println("Increasing order");
        }
            else if(num1 < num2 && num2 < num3){
            System.out.println("Decreasing order");
        }


        else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
