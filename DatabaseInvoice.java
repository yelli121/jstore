
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author Yelli Yulfita
 * @version 04-04-2019
 */
public class DatabaseInvoice
{
    private Invoice[] listInvoice;
    private static Invoice invoice;
    
    public DatabaseInvoice() {
    }
    
     public static boolean addInvoice(Invoice invoice)
    {
        return false;
    }
    
    public static void removeInvoice(Invoice invoice)
    {
        
    }
    
    public Invoice getInvoice(){
        return invoice;
    }
    
    public Invoice[] getListInvoice(){
        return listInvoice;
    }
}

    
        
    
    
    