package BusinessLogic_Layer;

import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;


public class DateDiff {
    public void validDate(String bookingDate){//confirming a booking
        try{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        Date curDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/uuuu");
        String curdateString = formatDate.format(curDate);;

        LocalDate date1 = LocalDate.parse(curdateString,formatter);
        LocalDate date2 = LocalDate.parse(bookingDate,formatter);

        long dateDiff = ChronoUnit.DAYS.between(date1, date2);
        
        System.out.println(dateDiff); //unfinished
           

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public boolean dateAvailable(Date bookingDate, Date nextClosestDate)
    {
      
      return bookingDate.getTime() >= nextClosestDate.getTime();
      
    }



}
