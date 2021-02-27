package BusinessLogic_Layer;

import java.sql.Date;

public interface Calculations 
{
    public void validDate(String bookingDate);

    public void dateAvailable(String bookingDate, Date nextClosestDate);
}
