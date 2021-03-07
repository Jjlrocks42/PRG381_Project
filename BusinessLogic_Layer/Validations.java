package BusinessLogic_Layer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataAccess_Layer.User_Bookings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class Validations implements Validators, Calculations {

    @Override
    
    public boolean validDate(String bookingDate) {//checks if date is 15 days from current date
        boolean valid = false;
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");


            if(dateDiff > 15)
            {
                System.out.println("Date is valid");
                valid = true;
            } 
            else
            {
                System.out.println("Date is invalid");
            }

            }catch(Exception e){
                e.printStackTrace();
            }   
            }  
        return valid; 
    }

    @Override
    public String dateAvailable(String bookingDate) {
        User_Bookings users = new User_Bookings();
        List<String> textfile = new ArrayList<>();
    public boolean dateAvailable(String bookingDate) {
        boolean available=true;

        List<Event> events = new ArrayList<>();
        //TODO: events = method that reads textfile
        for (Event event : events) {
            if (event.date == bookingDate) {
                available = false;
            }
        }


        return bookingDate;
        return available;
    }

    @Override
    public Double mealAmmountDue(int adultTotal,int childTotal, Double AdultmealPrice, Double childmealPrice, Double othermealPrice) {
        Double pAdult,pChild,pOther;
        if(adultTotal>=40){
            AdultmealPrice*= adultTotal;
            pAdult= AdultmealPrice-(AdultmealPrice*0.15);
        }else{
            pAdult= adultTotal*AdultmealPrice;
        }
        pChild= childTotal*childmealPrice;
        pOther= (adultTotal+childTotal)*othermealPrice;
        return pAdult+pChild+pOther;
    }
}