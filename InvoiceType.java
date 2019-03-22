package jstore;


/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/

public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    
    String type;
    InvoiceType(String type){
    this.type = type;
    }
    
    public String toString(){
    return "";
    }
    
}