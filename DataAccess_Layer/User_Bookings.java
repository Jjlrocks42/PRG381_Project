package DataAccess_Layer;

import java.io.*;

import java.util.Date;

public class User_Bookings implements DataWriter{

 public String Name;
public Date date;

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
			// TODO Auto-generated method stub
			try {

                Getname("Juan");
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                  System.out.println("File created: " + myObj.getName());
                } else {
                  System.out.println("File already exists.");
                }
              } catch (IOException e) {
                System.err.println("An error occurred.");
                e.printStackTrace();
              }
              

              try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!"+" Right "+Name);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }

    }
    
    

  }
      
            

    


        
      