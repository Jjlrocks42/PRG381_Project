package DataAccess_Layer;

import java.util.Date;
import java.io.*;


public class Items implements DataWriter {

public String Name;
public double Price;
public int booking_num;

    @Override
    public void Getname(String name) {
        
        this.Name=name; 
    }

    @Override
    public void GetDate(Date Booking_Date) {
        

    }

    @Override
    public void GetExtraInformation(String info) {
        

    }

    @Override
    public void AmountPaid(Double amount) {
        

    }

    @Override
    public void GetItemPrice(Double price) {
        this.Price=price;

    }

    @Override
    public void Amountdue(Double amountdue) {
        

    }

    public void getBooking_num(int Book) {
        this.booking_num=Book;
    }

    @Override
    public void Text() {
        try{
            File myObj = new File("Items.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());

              try {
                      
                FileWriter myWriter = new FileWriter("Items.txt");
                PrintWriter pw=new PrintWriter(myWriter);
              pw.println(booking_num+","+Name+",");
              pw.close();
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
            } else 
            {

              System.out.println("File already exists.");
              FileWriter myWriter = new FileWriter("Items.txt",true);
              PrintWriter pw=new PrintWriter(myWriter);
              pw.println(booking_num+","+Name+",");
              pw.close();
              
            }
        }catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
        

        
    }
    
}
