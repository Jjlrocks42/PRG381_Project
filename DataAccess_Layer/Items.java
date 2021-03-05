<<<<<<< HEAD
package DataAccess_Layer;

import java.util.Date;
import java.io.*;
import java.util.Scanner;

public class Items implements DataWriter {

public String Name;
public double Price;
public int booking_num;

    @Override
    public void Getname(String name) {
        // TODO Auto-generated method stub
        this.Name=name;
    }

    @Override
    public void GetDate(Date Booking_Date) {
        // TODO Auto-generated method stub

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

    @Override
    public void GetSurname(String Surname) {
        // TODO Auto-generated method stub

    }

    @Override
    public void GetPhone(String phoneNumber) {
        // TODO Auto-generated method stub

    }

    @Override
    public void GetDate(long Booking_Date) {
        // TODO Auto-generated method stub

    }

    @Override
    public void GetAdress(String adress) {
        // TODO Auto-generated method stub

    }

    @Override
    public void AmountofAdults(int Pnum) {
        // TODO Auto-generated method stub

    }

    @Override
    public void Amountofkids(int knum) {
        // TODO Auto-generated method stub

    }

    @Override
    public void totalPeople() {
        // TODO Auto-generated method stub

    }
    
}
