package Presentation_Layer;

import java.util.Scanner;

import DataAccess_Layer.User_Bookings;

public class Presentation 
{
    public static void main(String[] args) {
      
        System.out.println("hi ");
    User_Bookings usr = new User_Bookings();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.next();

    usr.Getname(name); 
         usr.Text();

      }
}
