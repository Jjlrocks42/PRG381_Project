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


public class Validations implements Validators {
    
   
    @Override
    public boolean validDate(String bookingDate) {//checks if date is 15 days from current date(works)
        boolean valid = false;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");//format date
        String today = LocalDate.now().format(formatter);//get todays date
        LocalDate date1 = LocalDate.parse(today,formatter);
        LocalDate date2 = LocalDate.parse(bookingDate,formatter);

        long dateDiff = ChronoUnit.DAYS.between(date1, date2);//compare dates
        if (dateDiff >=15) {
            valid = true;
        }
    
        return valid; 
    }

    //function doesnt work because date cannot be extracted from a object list
    //need to find a way to read data into an objet array eg Userbookings[] userbookings;
    @Override
    public boolean dateAvailable(String bookingDate) throws IOException {
        boolean available=true;
        User_Bookings usr = new User_Bookings();
        List<User_Bookings> userbookings = usr.read_file();
        
        for (User_Bookings user_Bookings : userbookings) {
            if(user_Bookings.date == Long.pabookingDate)}{
                available = false;
            }

        }
        }
    
         
        
        return available;
    }

    public static String[] unavailibleDates(){
        User_Bookings[] dates;
        int i = 0;
        for (User_Bookings booking : dates) {
            dates[i] = booking.days;//apparently an object list can not get spesific data
            i++;
        }
        
        
        return dates;
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
