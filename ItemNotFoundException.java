
/**
 * Write a description of class ItemNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemNotFoundException extends Exception
{
    private int item_error;
    
    public ItemNotFoundException(int item_input)
    {
        super.getMessage();
    }
    
    public String getExMessage(){
        return super.getMessage() + item_error + "not found.";
    }
    
    public String toString()
    {
        System.out.println("Item ID:");
        return "";
    }
}
