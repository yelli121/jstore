package jstore;


/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemCategory
{
    Electronics("Electronics"),
    Funiture("Funiture"),
    Stationery("Stationery");
    
    private String category;
    
    ItemCategory(String category){
        this.category = category;
    }
    
    @Override
    public String toString(){
        return category;
    }
    

}
