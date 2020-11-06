// ******************************************
// Dr. Hayati TASTAN
// https://www.linkedin.com/in/hayatitastan/
// https://github.com/haytastan
// Nov 6, 2020
// *****************************************
import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Using Scanner for Getting Input from User
        System.out.println("What is your name? ");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("Your name is:  " + s);

        System.out.println("How old are you "+ s + " ?");
        int a = in.nextInt();
        System.out.println("You are "+ a + " years old.");

        System.out.println("How long are you in meter " + s + " ?");
        float b = in.nextFloat();
        System.out.println("You are "+ b + " meter long");
    }
}