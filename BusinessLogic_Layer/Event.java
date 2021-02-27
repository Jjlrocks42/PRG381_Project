package BusinessLogic_Layer;

import java.util.Date;

import java.time.Duration;

public class Event 
{

    public void confirming(Date bookingDate, float paid, float price){//confirming a booking
        try{
            Date dateCur = new Date();
            long days = Duration.between(dateCur, bookingDate).toDays();
            float p = paid/price;
            if((!(days<15)) && (p>=0.5)){
                //call data writer meth to confirm
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean dateAvailable(Date bookingDate, Date nextClosestDate)
    {
      
      return bookingDate.getTime() >= nextClosestDate.getTime();
      
    }


    
    
}
