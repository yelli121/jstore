
/**
 * Write a description of class CustomerDoesntHaveActiveInvoiceException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerDoesntHaveActiveInvoiceException extends Exception
{
    private Customer customer_error;
    
    public CustomerDoesntHaveActiveInvoiceException(Customer customer_input){
        super.getMessage();
        
    }
    
    public String getExMessage(){
        return super.getMessage()+customer_error+"\ndoesnt have active invoice";
       
    }
}

    
    
    