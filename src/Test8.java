import java.util.Scanner;

public class Test8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x = "";
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            x = x + i;
            System.out.println(x);

        }

            int y = 1;

            for(int i = 2; i <= num + 1; i++) {
                System.out.println(y);
                y = y * 10 + i;

        }

    }
}
