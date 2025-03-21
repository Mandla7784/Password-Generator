/**
 * Task: Random Password Generator
 *
 * Description: Build a program that generates a
 * random password for the user. Prompt the user to
 * enter the desired length of the password and
 * specify whether it should include numbers,
 * lowercase letters, uppercase letters, and special
 * characters. Generate the password accordingly
 * and display it to the user.
 *
 * Skills: Random number generation,
 */


import java.util.Random;
import java.util.Scanner;


public  class PasswordGenerator  {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter desired length:");

      int desired_length = scanner.nextInt();
      System.out.println("Should it include Special char?: <Y/N>");
      String userResposne =  scanner.nextLine().toUpperCase().trim();
      if(userResposne.equals("Y")){
          // return password with special charecters
          String randomPassword = passwordWithSpecialCharecters();
          System.out.println(randomPassword);

      }

    }
    static  String passwordWithSpecialCharecters(){

    }
}