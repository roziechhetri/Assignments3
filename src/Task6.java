import java.util.Scanner;

public class Task6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        boolean leap = true;
        switch (month){
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;

            case 2:
                if(year % 4 == 0)
                {
                    if( year % 100 == 0)
                    {
                        // year is divisible by 400, hence the year is a leap year
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


                    if(leap = true){
                System.out.println("February " + year + " has 29 days");
                    }

                else
                    {
                        System.out.println("February " + year + " has 28 days");
                    }
                break;

            case 3:
                System.out.println("March " + year + " has 31 days");
                break;

            case 4:
                System.out.println("April " + year + " has 30 days");
                break;

            case 5:
                System.out.println("May " + year + " has 31 days");
                break;

            case 6:
                System.out.println("June " + year + " has 30 days");
                break;

            case 7:
                System.out.println("July " + year + " has 31 days");
                break;

            case 8:
                System.out.println("August " + year + " has 30 days");
                break;

            case 9:
                System.out.println("September " + year + "has 31 days");
                break;

            case 10:
                System.out.println("October " + year + "has 30 days");
                break;

            case 11:
                System.out.println("November " + year + "has 31 days");
                break;

            case 12:
                System.out.println("December " + year + "has 30 days");
               break;
        }
    }
}
