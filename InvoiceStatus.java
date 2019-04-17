
/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/

public enum InvoiceStatus
{
    Paid("Paid"),Unpaid("Unpaid"),Installment("Installment");
    private String description;
    private InvoiceStatus(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}
