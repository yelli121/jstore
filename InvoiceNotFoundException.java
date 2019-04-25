
/**
 * Write a description of class InvoiceNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
public class InvoiceNotFoundException extends Exception
{
     private int invoice_error;
     
     public InvoiceNotFoundException(int invoice_input)
     {
         super.getMessage();
        }
       
     public String getExMessage(){
         return super.getMessage()+invoice_error+"not found.";
        }
       
     public String toString ()
     {
         System.out.println("Invoice ID:");
         return "";
    }
}
    
        