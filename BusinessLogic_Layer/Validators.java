package BusinessLogic_Layer;

import java.io.IOException;
import java.sql.Date;

public interface Validators
{
    public boolean validDate(String bookingDate);

    public boolean dateAvailable(String bookingDate) throws IOException;
  
    
    

    
}
