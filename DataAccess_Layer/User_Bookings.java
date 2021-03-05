package DataAccess_Layer;

import java.io.*;

import java.util.Date;
import java.util.Scanner;

public class User_Bookings implements DataWriter{

 public String Name, data, number, adress, event;
public Date date;
public int booking_num , KidsTotal, AdultTotal;
public double Amount, Amountneeded;

    @Override
    public void Getname(String name) 
    {
        // TODO Auto-generated method stub
        //name="Juan";
        this.Name=name;
        System.out.println(name);
    }

        @Override
        public void GetDate(Date Booking_Date)
         {
            // TODO Auto-generated method stub
            this.date=Booking_Date;
        }

        @Override
        public void GetExtraInformation(String info) {
            // TODO Auto-generated method stub

        }

        @Override
        public void AmountPaid(Double amount) {
            // TODO Auto-generated method stub

        }

        @Override
        public void GetItemPrice(Double price) {
            // TODO Auto-generated method stub

        }

        @Override
        public void Amountdue(Double amountdue) {
            // TODO Auto-generated method stub

        }

		@Override
		public void Text() {
      
      booking_num++;
      try{
        File myObj = new File("filename.txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());

          try {
                  
            FileWriter myWriter = new FileWriter("filename.txt");
            PrintWriter pw=new PrintWriter(myWriter);
          pw.println(booking_num+","+Name+","+event+","+adress+","+number+","+AdultTotal+","+KidsTotal+","+date+","+Amount+","+Amountneeded);
          pw.close();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        } else 
        {
          
          Scanner myReader = new Scanner(myObj);
                  while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    System.out.println(data);
                  }
          myReader.close();
          String test=data.substring(0, data.indexOf(','));
          booking_num=Integer.parseInt(test);
          booking_num++;
          System.out.println("File already exists.");
          FileWriter myWriter = new FileWriter("filename.txt",true);
          PrintWriter pw=new PrintWriter(myWriter);
          pw.println(booking_num+","+Name+","+event+","+adress+","+number+","+AdultTotal+","+KidsTotal+","+date+","+Amount+","+Amountneeded);
          pw.close();
        }
      }catch (IOException e) {
        System.err.println("An error occurred.");
        e.printStackTrace();
      }
			  
              
    }
    
    

}
      
            

    


        
      