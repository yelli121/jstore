
/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/



public enum InvoiceStatus
{
    PAID("Paid"), UNPAID("Unpaid"), INSTALLMENT("Installment");
    private String value;
    
    private InvoiceStatus(String value)
    {
        this.value=value;
    }
}