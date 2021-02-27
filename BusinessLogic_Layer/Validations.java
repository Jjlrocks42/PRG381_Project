package BusinessLogic_Layer;

import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;


public class Validations implements Interface{
   
    @Override
    public void validDate(String bookingDate) {//checks if date is 15 days from current date
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    
            Date curDate = new Date();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/uuuu");
            String curdateString = formatDate.format(curDate);;
    
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
    public void dateAvailable(String bookingDate, java.sql.Date nextClosestDate) {//Checks if date is available
        //return bookingDate.getTime() >= nextClosestDate.getTime();
    }
}
