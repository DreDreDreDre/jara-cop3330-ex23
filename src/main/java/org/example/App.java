package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        String response = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        response = sc.nextLine();

        if(response.contains("y") || response.contains("Y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            response = sc.nextLine();

            if(response.contains("y") || response.contains("Y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car crank up but fail to start? ");
            response = sc.nextLine();

            if(response.contains("y") || response.contains("Y"))
            {
                System.out.println("Check spark plug connections.");
            }
            else
            {
                System.out.print("Does the engine start and then die? ");
                response = sc.nextLine();

                if(response.contains("y") || response.contains("Y"))
                {
                    System.out.print("Does you car have fuel injection? ");
                    response = sc.nextLine();

                    if(response.contains("y") || response.contains("Y"))
                    {
                        System.out.println("Get it in for service.");
                    }
                    else
                    {
                        System.out.println("Check to ensure the choke is opening and closing.");
                    }
                }
                else
                {
                    System.out.println("This should not be possible.");
                }
            }
        }
    }
}
