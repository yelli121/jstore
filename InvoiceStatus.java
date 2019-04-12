
/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/

public enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");
    private String value;
    
    public String toString()
    {
        return value;
    }
    
    InvoiceStatus(String value)
    {
        this.value=value;
    }
}
