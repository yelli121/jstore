
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private Customer[] listCustomer;
    private Customer customer;
    public DatabaseCustomer(){
    }
    
    public static boolean addCustomer(Customer customer)
    {
        return false;
    }
    
    public static void removeCustomer(Customer customer)
    {
        }
    public Customer getCustomer(){
        return customer;
    }
    
    public Customer[] getListCustomer(){
        
        return listCustomer;
    }
    public abstract String toString();
    
}

        
        


    
    
   