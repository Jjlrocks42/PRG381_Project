package DataAccess_Layer;

import java.sql.Date;

public interface DataWriter {
   
    
    public void Getname( String name);

    public void GetSurname( String Surname);

    public void GetPhone( String phoneNumber);

    public void GetDate( Long d);
    
    public void GetAdress( String adress);

    public  void GetExtraInformation( String info);

    public  void AmountPaid(Double amount) ;
   
    public  void GetItemPrice(Double price) ;
  
    public  void AmountofAdults(int Pnum) ;

    public  void Amountofkids(int knum) ;

    public  void totalPeople() ;

    public  void Amountdue(Double amountdue) ;
   
    
    public  void Text();
}

