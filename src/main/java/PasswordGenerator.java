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


import java.util.List;
import java.util.Random;
import java.util.Scanner;
import  java.util.Arrays;

public  class PasswordGenerator {
    public static void main(String[] args) {

        String[] passwords = {
                "m#P52s@ap$V",
                "$7H@n3#Waterfall",
                "MountainBreeze99+Tree",
                "cXmnZK65rf&DaaD",
                "Yuc8$RikA34%ZoPPao98t",
                "k8dfh8c@Pfv0gB2",
                "e246gs%mFs#3tv6",
                "Totb9484@",
                "6MonkeysRLooking^",
                "HorsePurpleHatRunBay",
                "Horse Purple Hat Run Bay Lifting"
        };

      while (true){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter desired length:");

          int desired_length = scanner.nextInt();
          System.out.println("Should it include Special char ? <Y/N>");
          scanner.nextLine();

          var userResposne = scanner.nextLine().toUpperCase();
          scanner.nextLine();

          if (userResposne.equals("Y")) {
              // return password with special charecters
              String randomPassword = passwordWithSpecialCharecters(passwords , desired_length);
              System.out.println(randomPassword);
              continue;
          }else{
              System.out.println("Poor password strength!!");
              break;
          }
      }
    }

   public  static String passwordWithSpecialCharecters(String[]  pwds , int len) {
       Random number = new Random();
       int  randomPassword= new Random().nextInt(pwds.length);


       String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        for(String password :  pwds){
            if(pwds[randomPassword].matches(pattern)  && pwds[randomPassword].length()  >= len ){
                System.out.println("This is a good password");

                return  pwds[randomPassword];
            }else {

                System.out.println("Invalid password");
            }

        }
     return pwds[randomPassword];

    }
}