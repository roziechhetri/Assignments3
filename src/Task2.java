


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want sum of");

        int sum = 0;

        for(int input = 0; input <=10; input++){
            int val = sc.nextInt();
            sum = sum+val;
            System.out.println("The sum of your inputs are:"+ " " + sum);
        }

        float avg = (float) sum/10;
        System.out.println("The average is:" + " " + avg);



    }
}
