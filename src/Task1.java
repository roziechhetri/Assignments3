import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to multiply");
        int number = sc.nextInt();


        int x = 1;
        while(x <= 10){
            System.out.println("The multiplication of number you provided is:"+ " " + x  * number );
            x++;
        }





    }
}
