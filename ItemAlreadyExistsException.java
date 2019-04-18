
/**
 * Write a description of class ItemAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemAlreadyExistsException extends Exception
{
    private Item item_error;
    
    public ItemAlreadyExistsException(Item item_input)
    {
        super.getMessage();
    }
    
    public String getExMessage()
    {
        return super.getMessage()+item_error.getName()+",Category:"+item_error.getCategory()+",Status:" +item_error.getStatus()+"from:" + item_error.getSupplier().getName()+ "already exists.";
    }
    
    public String toString()
    {
    System.out.println("Item Name:");
    return "";
     }

}
