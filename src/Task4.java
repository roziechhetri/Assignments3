import java.util.Scanner;
public class Task4 {


        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the long numbers for the calculation");

            Long lg = sc.nextLong();
            String str = String.valueOf(lg);
                int sum = 0;
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                 sum = sum + Character.getNumericValue(str.charAt(i));
               // System.out.println("The sum is:" + " " + sum);
            }
            System.out.println("The sum is: "+ sum);
            System.out.println(str.length());

        }

    }


