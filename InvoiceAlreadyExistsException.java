
/**
 * Write a description of class InvoiceAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;
    public InvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super.getMessage();
    }
    
    public String getExMessage(){
        return super.getMessage()+invoice_error.getItem()+"already ordered by"+invoice_error.getCustomer().getUsername();
    }
    
    public String toString()
    {
        System.out.println("Invoice with Item list");
        return "";
    }
    
    
}


    
    