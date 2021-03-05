
package DataAccess_Layer;

import java.io.*;

import java.util.Date;
import java.util.Scanner;
import DataAccess_Layer.*;

public class User_Bookings implements DataWriter{

 public String Name,Surname, data, number, adress, event,INFO;
public long date;
public int booking_num , KidsTotal, AdultTotal,People;
public static double Amount;
public static double Amountneeded;
public double amountdue;

@Override
public void Getname(String name) {
  // TODO Auto-generated method stub
  // name="Juan";
  this.Name = name;
  System.out.println(name);
}

@Override
public void GetDate(long d) {
  // TODO Auto-generated method stub
  this.date = d;
}

@Override
public void GetExtraInformation(String info) {
  // TODO Auto-generated method stub
  this.INFO = info;
}

@Override
public void AmountPaid(Double amount) {
  // TODO Auto-generated method stub
  this.Amount = amount;

}

@Override
public void GetItemPrice(Double price) {
  // TODO Auto-generated method stub
  this.Amountneeded = price;
}

@Override
public void Amountdue(Double amountdue) {

  Double amp, amn;
  amp = Amount;
  amn = Amountneeded;

  amountdue = amn - amp;
  this.amountdue = amountdue;
}

@Override
public void Text() {

  booking_num++;
  try {
    File myObj = new File("filename.txt");
    if (myObj.createNewFile()) {
      System.out.println("File created: " + myObj.getName());

      try {

        FileWriter myWriter = new FileWriter("filename.txt");
        PrintWriter pw = new PrintWriter(myWriter);
        pw.println(booking_num + "," + Name + "," + event + "," + adress + "," + number + "," + AdultTotal + ","
            + KidsTotal + "," + date + "," + Amount + "," + Amountneeded);
        pw.close();
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    } else {

      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
      String test = data.substring(0, data.indexOf(','));
      booking_num = Integer.parseInt(test);
      booking_num++;
      System.out.println("File already exists.");
      FileWriter myWriter = new FileWriter("filename.txt", true);
      PrintWriter pw = new PrintWriter(myWriter);
      pw.println(booking_num + "," + Name +','+Surname+ "," + event + "," + adress + "," + number + "," + AdultTotal + ","
          + KidsTotal + "," + date + "," + Amount + "," + Amountneeded);
      pw.close();
    }
  } catch (IOException e) {
    System.err.println("An error occurred.");
    e.printStackTrace();
  }

}

@Override
public void GetSurname(String surname) 
{
  // TODO Auto-generated method stub
  this.Surname=surname;
}



@Override
public void GetPhone(String phoneNumber) 
{
  this.number=phoneNumber;
  // TODO Auto-generated method stub

}

@Override
public void GetAdress(String Adress) 
{
  this.adress=Adress;
  // TODO Auto-generated method stub

}

@Override
public void AmountofAdults(int Pnum) 
{
  // TODO Auto-generated method stub
  this.AdultTotal=Pnum;

}

@Override
public void Amountofkids(int knum) 
{
  // TODO Auto-generated method stub
  this.KidsTotal=knum;

}

@Override
public void totalPeople() {
  // TODO Auto-generated method stub

  this.People=this.AdultTotal+KidsTotal;

}






   

    

}
      
            

    


