package DataAccess_Layer;

import java.io.*;

import java.util.Date;
import java.util.Scanner;

public class User_Bookings implements DataWriter{

 public String Name, data;
public Date date;
public int booking_num = 1;


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



        
              
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                  System.out.println("File created: " + myObj.getName());
                } else 
                {

                  System.out.println("File already exists.");

                //THis is to read from the textfile   This is to keep track of the bookings and this is also to keep track of the order numbers                 
                  Scanner myReader = new Scanner(myObj);
                  while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    System.out.println(data);
                  }
                //   FileReader fr=new FileReader(myObj);
                //   BufferedReader br=new BufferedReader(fr);
                 
                //  //this is to iterate through the characters in the file to find the booking
                //   int c = 0;             
                //   while((c = br.read()) != -1)         //Read char by Char
                //   {
                //         char character = (char) c;          //converting integer to char
                //         System.out.println(character);        //Display the Character
                //   }
                  
                  myReader.close();

                  String s = data;

                          String[] fragments = s.split(" ");
                          
                          String firstColumn = fragments[0];
                          
                          boolean hasI = firstColumn.contains(String.valueOf(booking_num));
                          

                          if (hasI==true)
                           {
                             booking_num++;
                             System.out.println("Fragment: "+firstColumn+" contains i: "+hasI+" thats why i want the first fragment: "+firstColumn);
                             
                                  FileWriter myWriter = new FileWriter("filename.txt");
                                  myWriter.append(booking_num+","+Name);
                                  myWriter.close();
                                  System.out.println("Successfully Appended to the file.");
                          } else 
                          {
                                  System.out.println("The booking is still avalable");


                                  try {
                      
                                    FileWriter myWriter = new FileWriter("filename.txt");
                                    myWriter.write(booking_num+","+Name);
                                    myWriter.close();
                                    System.out.println("Successfully wrote to the file.");
                                  } catch (IOException e) {
                                    System.out.println("An error occurred.");
                                    e.printStackTrace();
                                  }
              

                          }
                         // String firstColumn = fragments[0];
                          
                         





                  //this is to get info on the file
                  System.out.println("File name: " + myObj.getName());
                  System.out.println("Absolute path: " + myObj.getAbsolutePath());
                  System.out.println("Writeable: " + myObj.canWrite());
                  System.out.println("Readable " + myObj.canRead());
                  System.out.println("File size in bytes " + myObj.length());

                }
              } catch (IOException e) {
                System.err.println("An error occurred.");
                e.printStackTrace();
              }
              

    }
    
    

  }
      
            

    


        
      