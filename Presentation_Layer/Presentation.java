package Presentation_Layer;

import java.util.Date;
import java.util.Scanner;

import DataAccess_Layer.User_Bookings;

public class Presentation 
{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
    System.out.flush();  
        System.out.println("hi ");
    User_Bookings usr = new User_Bookings();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.next();
    usr.Getname(name); 

    System.out.println("Enter your name");
    String d =sc.next();
   // Date date = Date.parse(d);
   
    //usr.GetDate(date);
         usr.Text();

      }
}
