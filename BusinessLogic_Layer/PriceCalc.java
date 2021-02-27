package BusinessLogic_Layer;


import DataAccess_Layer.DataWriter;

import java.time.Duration;




public class PriceCalc{


    public float adultdiscounted(int noPeople, int adults,Scale adultMealP ){
        if(noPeople>=40){
            adultMealP*=adults;
           return adultMealP=adultMealP-(adultMealP*0.15);
        }else{
            return adultMealP;
        }

    }
}