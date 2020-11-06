// ******************************************
// Dr. Hayati TASTAN
// https://www.linkedin.com/in/hayatitastan/
// https://github.com/haytastan
// Nov 6, 2020
// *****************************************
import java.io.Console;
import java.lang.*;
import java.util.Scanner; //not used

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {

        // Create the console object
        Console cmd = System.console();

        if (cmd == null) {
            System.out.println("No console available");
            return;
        }

        int number=0;
        do{
            // Scanner utility to input data from user:
            // Scanner in = new Scanner(System.in);
            // int number = in.nextInt();
            // System.out.println("You entered integer: " + number);

            //Using Console to input data from user:
            System.out.println("Enter an integer number max with 2 digits: [enter 0 to quit]");
            String stringNumber = cmd.readLine();
            if (stringNumber.equals("") || stringNumber.length() > 2 )  {
                System.out.println("You have entered nothing or a number with more than 2 digits...");
                continue;
            }
            else {
                number = Integer.parseInt(stringNumber);
                System.out.println("You entered: " + number);
            }
        }
        while (number!=0);
    }
}