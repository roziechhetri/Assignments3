import java.util.Scanner;

public class Test7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        boolean leap = true;


                if(year % 4 == 0)
                {
                    if( year % 100 == 0)
                    {

                        if ( year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }
                    else
                        leap = true;
                }
                else
                    leap = false;


                if(leap = true) {

                    System.out.println("Ths is leap year");

                }
                else
                        {
                            System.out.println("This is not leap year");
                        }
                    }
                }


