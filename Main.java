/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {
	    System.out.println("What is your current age? ");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        System.out.println("At what age would you like to retire? ");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();
        System.out.println("You have " + (b-a) + " years left until you can retire.");
        int y = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's " + y + ", so you can retire in " + (y+(b-a)));
    }
}
