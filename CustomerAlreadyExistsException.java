
/**
 * Write a description of class CustomerAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
public class CustomerAlreadyExistsException extends Exception
{
    private Customer customer_error;
    
    public CustomerAlreadyExistsException(Customer customer_input){
    }
    public String getExMessage(){
        return super.getMessage()+customer_error.getEmail()+",or username:"+customer_error.getUsername()+"already exists.";
    }
}

    