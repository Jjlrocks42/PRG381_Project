package Presentation_Layer;

import java.util.Date;
import java.util.Scanner;



import DataAccess_Layer.*;

public class Presentation 
{
  public  enum Opps
    {
        displayAll,
        CheckAvalability,
        exit
    }


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
    while (Phone.length()>10) 
    {
        System.out.println("Enter a valid Phone number");
         Phone = sc.next();
         System.out.println("\n");
    }

    usr.GetPhone(Phone); 

   
    int year=2020;
    int month;
    int date;
    int hrs;
    int min;
    int sec =0;

    System.out.println("Enter booking your date Year");
    year = Integer.parseInt( sc.next());
    System.out.println("Enter booking your date month in number format");
    month = Integer.parseInt( sc.next());
    while (month>12)
     {
        System.out.println("Enter a Valid month in number format");
    month = Integer.parseInt( sc.next());
    }

    System.out.println("Enter booking your date day in number format");
    date = Integer.parseInt( sc.next());

    while (date>31)
    {
       System.out.println("Enter a Valid day in number format");
   date = Integer.parseInt( sc.next());
   }


    System.out.println("Enter booking your event's starting hour");
    hrs = Integer.parseInt( sc.next());


    while (hrs>24)
    {
       System.out.println("Enter a Valid Hour in number format");
   hrs = Integer.parseInt( sc.next());
   }

    System.out.println("Enter booking your event's starting minutes");
    min = Integer.parseInt( sc.next());

    while (min>59)
    {
       System.out.println("Enter a Valid amount of min in number format");
         min = Integer.parseInt( sc.next());
   }
    
    Long d =Date.UTC(year, month, date, hrs, min, sec);
    usr.GetDate(d); 

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
