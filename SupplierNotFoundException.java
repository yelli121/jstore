
/**
 * Write a description of class SupplierNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
public class SupplierNotFoundException extends Exception
{
   private int supplier_error;
   
   public SupplierNotFoundException(int supplier_input)
   {
       
    }
    
    public String getExMessage()
    {
        return super.getMessage()+supplier_error+"not found.";
    }
}
