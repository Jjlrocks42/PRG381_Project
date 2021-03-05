package BusinessLogic_Layer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataAccess_Layer.User_Bookings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;


public class Validations implements Interface, Calculations {
   
    @Override
    public void validDate(String bookingDate) {//checks if date is 15 days from current date
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    
            Date curDate = new Date();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/uuuu");
            String curdateString = formatDate.format(curDate);;
            bookingDate = formatDate.format(bookingDate);
    
            LocalDate date1 = LocalDate.parse(curdateString,formatter);
            LocalDate date2 = LocalDate.parse(bookingDate,formatter);
    
            long dateDiff = ChronoUnit.DAYS.between(date1, date2);
            
            if(dateDiff > 15)
            {
                System.out.println("Date is valid");
            } 
            else
            {
                System.out.println("Date is invalid");
            }
                  
            }catch(Exception e){
                e.printStackTrace();
            }   
    }

    @Override
    public String dateAvailable(String bookingDate) {
        User_Bookings users = new User_Bookings();
        List<String> textfile = new ArrayList<>();
        
         
        
        return bookingDate;
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
