package BusinessLogic_Layer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import DataAccess_Layer.User_Bookings;


public class Validations implements Validators {
    
   
    @Override
    public boolean validDate(String bookingDate) {//checks if date is 15 days from current date
        boolean valid = false;
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
                valid = true;
            } 
            }catch(Exception e){
                e.printStackTrace();
            }  
        return valid; 
    }

    @Override
    public boolean dateAvailable(String bookingDate) throws IOException {
        boolean available=true;
        List<User_Bookings> listBookings= User_Bookings.read_file();
        
       
        for (User_Bookings list : listBookings) {
            if (list.date == Long.parseLong(bookingDate))  {
                available = false;
            }
        }
         
        
        return available;
    }

    
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
