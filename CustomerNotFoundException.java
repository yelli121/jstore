
/**
 * Write a description of class CustomerNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerNotFoundException extends Exception
{
   private int customer_error;
   public CustomerNotFoundException(int customer_input)
   {
    }
    
    public String getExMessage()
    {
        return super.getMessage()+ customer_error+"not found.";
    }
}
