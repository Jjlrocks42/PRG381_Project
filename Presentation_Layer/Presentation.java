package Presentation_Layer;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import BusinessLogic_Layer.Validations;
import DataAccess_Layer.*;
import jdk.nashorn.api.tree.WhileLoopTree;

public class Presentation 
{
  public  enum Opps
    {
        displayAll,
        CheckAvalability,
        exit
    }


    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        

    User_Bookings usr = new User_Bookings();
    Validations valid = new Validations();
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
    while (Phone.length()>10) 
    {
        System.out.println("Enter a valid Phone number");
         Phone = sc.next();
         System.out.println("\n");
    }

    //shows all dates that have been booked
    System.out.println("Dates that are allready booked: \n");
    String[] unavailibleDates= valid.unavailibleDates();
    for (int i = 0; i < unavailibleDates.length; i++) {
        System.out.print(unavailibleDates[i] + ", ");
    }

    //asks user for a date and checks if it is > 15 days and if it has not been taken yet
    System.out.println("Please enter your booking date (dd/mm/yyyy)");
    String line = sc.next();
    boolean dateNotBooked = valid.dateAvailable(line);
    
    while (valid.dateAvailable(line)== false &&  valid.validDate(line) == false) {
        System.out.println("Date should be at leas 15 days from now");
        System.out.println("Please enter your booking date (dd/mm/yyy");
        line = sc.next();
    }
    System.out.println("Date is valid");



    System.out.println("Enter your home address");
    String address = sc.next().toLowerCase();
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



    System.out.print("\033[H\033[2J");  
    System.out.flush();  


    
    //no longer needed beacause a function was written in validations(
    Opps opp1 = Opps.exit;
    int counter=1;


            for (Opps opp : Opps.values()) 
    {
        System.out.println(counter+".) "+opp);
        
    }

    System.out.println("Pick a Option");
    int option = Integer.parseInt( sc.next());
    

        switch (option) {
            case 1:
                opp1=Opps.displayAll;
                break;

                case 2:
                opp1=Opps.CheckAvalability;
                
                break;

                case 3:
                opp1=Opps.exit;
                break;
            
        
            default:
            opp1=Opps.exit;

                break;
        }

        switch (opp1) 
{
    case displayAll:
        

        break;
    case CheckAvalability:
        
        break;

        case exit:
        System.exit(0);
        break;

    default:
        break;
}
        



    usr.Text();
        


   // Date date = Date.parse(d);
   
    //usr.GetDate(date);


        


        
     }

     

}
