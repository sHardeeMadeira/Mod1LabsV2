package madeira.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int firstnumber;
        int secondnumber;

        System.out.print("Enter any number of your choice: ");
        firstnumber = input.nextInt();

        System.out.print("Enter another number of your choice: ");
        secondnumber = input.nextInt();

        {
            if (firstnumber == secondnumber)
                System.out.printf("Equal. ");
        }
        {
            if (firstnumber > secondnumber)
                System.out.printf("First. ");
        }
        {
            if (firstnumber < secondnumber)
                System.out.printf("Second. ");
        }


        Scanner music = new Scanner(System.in);
        String mystring = "Alternative";
        String yourstring;

        System.out.print("Enter your fav genre of music: ");
        yourstring = music.nextLine();

        {
            if (mystring == yourstring)
                mystring = music.nextLine();
                System.out.printf("Same! ");


            if (mystring != yourstring)
                yourstring = music.nextLine();
                System.out.printf("Lame. ");
        }



        int rnumber = (int) (Math.random() * 17) + 1;
        Scanner guess = new Scanner(System.in);
        int yourguess;
        int tries = 0;
        int wins = 0;

        System.out.println("Enter a number between 0 and 17: ");

        do {
            System.out.println("Enter your guess: ");
            yourguess = guess.nextInt();
            if (yourguess == rnumber) {
                System.out.println("You did it! Awesome job :) ");
                wins++;
            } else if (yourguess < rnumber) {
                System.out.println("You guessed too low. Yikes. ");
                tries++;
                } else if (yourguess > rnumber)
                    System.out.println("Too high. Yikes. ");
                    tries++;
                } while (tries != 10 && wins != 1 || wins != 1);
                    System.out.printf("You couldn't get it in ten try's? Pathetic. ");



    {
        int rows=5;
        for (int i= rows-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


        {
            int rows=3;
            for (int i= rows-1; i>=0 ; i--)
            {
                for (int j=0; j<=i; j++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }

















            }
        }

