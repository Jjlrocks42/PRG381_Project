package BusinessLogic_Layer;

import java.util.Date;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.And;

public class Event 
{

    public void confirming(Date bookingDate, Float paid, float price){//confirming a booking
        try{
            Date dateCur = new Date();
            long days = Duration.between(dateCur, bookingDate).toDays();
            FLoat p = paid/price;
            if((!(days<15)) && (p>=0.5)){
                //call data writer meth to confirm
            }
        }catch(arseException e){
            e.printStackTrace();
        }
    }

    public void dateAvailable(){
        
    }


    
    
}
