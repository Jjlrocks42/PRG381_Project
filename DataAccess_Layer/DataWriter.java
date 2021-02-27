package DataAccess_Layer;

import java.util.Date;


/**
 * DataWriter
 */
public interface DataWriter{
   

    public void Getname( String name);

    public void GetDate( Date Booking_Date);
   

    public  void GetExtraInformation( String info);

    public  void AmountPaid(Double amount) ;
   
    public  void GetItemPrice(Double price) ;
  


    public  void Amountdue(Double amountdue) ;
   
    
    public  void Text();
}