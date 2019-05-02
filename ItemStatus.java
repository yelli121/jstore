package jstore;


/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemStatus
{
    New("New"),
    Second("Second"),
    Refurbished("Refurbished"),
    Sold("Sold");
    
    private String status;
    
    ItemStatus(String status){
        this.status = status;
    }
    
    @Override
    public String toString(){
        return status;
    }    
}
