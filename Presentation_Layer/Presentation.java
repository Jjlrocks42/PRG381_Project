package Presentation_Layer;

import java.util.Date;
import java.util.Scanner;

import DataAccess_Layer.User_Bookings;
import DataAccess_Layer.Items;

public class Presentation 
{
    public static void main(String[] args) {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    System.out.println("hi ");
    

    User_Bookings usr = new User_Bookings();
    Items items= new Items();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.next();
    usr.Getname(name); 

    System.out.println("Enter your Surname");
    String Surname = sc.next();
    usr.GetSurname(Surname); 
    
    System.out.println("Enter your Phone number");
    String Phone = sc.next();
    usr.GetPhone(Phone); 

    System.out.println("Enter booking your date");
    //long d = Date.parse(sc.next());
    //usr.GetDate(d); 

    System.out.println("Enter your Phone address");
    String address = sc.next();
    usr.GetAdress(address); 
    

    System.out.println("Enter the total number of adults that will be attending");
    int TotalAdults = Integer.parseInt( sc.next());
    usr.AmountofAdults(TotalAdults); 


    System.out.println("Enter the total number of kids that will be attending");
    int Totalkids = Integer.parseInt( sc.next());
    usr.Amountofkids(Totalkids); 

    usr.totalPeople();

    System.out.println("Enter item name");
    String itemname = sc.next();
    items.Getname(itemname);

    items.Text();




    System.out.println("Enter any other info you want us to know");
    String Info = sc.next();
    usr.GetExtraInformation(Info); 
    usr.Text();
        


   // Date date = Date.parse(d);
   
    //usr.GetDate(date);


        


        
     }

     

}
