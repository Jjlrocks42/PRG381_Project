package BusinessLogic_Layer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class Event 
{

    public void confirming(Date bookingDate, Float paid, float price){//confirming a booking
        try{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        String curDate = "01/02/2021";
        String bookDate = "20/03/2021";

        LocalDate date1 = LocalDate.parse(curDate,formatter);
        LocalDate date2 = LocalDate.parse(bookDate,formatter);

        long dateDiff = ChronoUnit.DAYS.between(date1, date2);
        
        System.out.println(dateDiff); //unfinished
           

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void dateAvailable(){
        
    }


    
    
}
