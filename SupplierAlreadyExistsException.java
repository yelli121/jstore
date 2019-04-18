
/**
 * Write a description of class SupplierAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupplierAlreadyExistsException extends Exception
{
    private Supplier supplier_error;
    
    public SupplierAlreadyExistsException(Supplier supplier_input)
{
    
}

public String getExMessage(){
    return super.getMessage() + supplier_error.getEmail()+",or phoneNumber:"+supplier_error.getPhoneNumber()+"already exists.";
    
}
}