
/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/

package jstore;

public enum InvoiceType
{
    BUY("buy"),SELL("sell");
    
    String description;
    private InvoiceType(String description)
    {
        this.description=description;
    }
    
    public String toString()
    {
        return description;
    }
}
