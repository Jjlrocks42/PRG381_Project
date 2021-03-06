
package DataAccess_Layer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import DataAccess_Layer.*;

public class User_Bookings{

 public String Name,Surname, data, number, adress, event,INFO;
public long date;
public int booking_num , KidsTotal, AdultTotal,People;
public double Amount;
public double Amountneeded;
public double amountdue;

private static Path filePath = Paths.get("filename.txt");

public User_Bookings(){}

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
public void Getname(String name) {
  // TODO Auto-generated method stub

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
public void GetDate(java.sql.Date Booking_Date) {
  // TODO Auto-generated method stub

}

@Override
public void GetAdress(String adress) {
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


  public static List<User_Bookings> read_file() throws IOException{
      
        FileInputStream fis = new FileInputStream("filename.txt");
        Scanner ss = new Scanner(fis);//reads whole record
        List<User_Bookings> bookings = new ArrayList<User_Bookings>();
      
        while(ss.hasNextLine()){
          
          String line = ss.nextLine();// Gets a line
          String[] parts = line.split(",");
          User_Bookings nb = new User_Bookings();
          nb.booking_num = Integer.parseInt(parts[0]);
          nb.Name = parts[1];
          nb.Surname = parts[2];
          nb.event = parts[3];
          nb.adress = parts[4];
          nb.number = parts[5];
          nb.AdultTotal = Integer.parseInt(parts[6]);
          nb.KidsTotal = Integer.parseInt(parts[7]);
          nb.data = parts[8];
          nb.Amount= Double.parseDouble(parts[9]);
          nb.Amountneeded=Double.parseDouble(parts[10]); 



          bookings.add(nb);
        }
        ss.close();

        return bookings;
  }

  public static void write_file(List<User_Bookings> bookings) throws IOException{
    if(Files.exists(filePath)) Files.delete(filePath);

    FileOutputStream os = new FileOutputStream(filePath.toString());
    PrintWriter pw = new PrintWriter(os);

    for (User_Bookings ub : bookings)
      pw.println(ub.toString());
    
      pw.close();
  }

  @Override
  public String toString(){
    return this.booking_num+','+this.Name+','+this.Surname+','+this.event+','+this.adress+','+this.number+','+this.AdultTotal+','+this.KidsTotal+','+this.data+','+this.Amount+','+ this.amountdue;
  }


}
      

            

    


