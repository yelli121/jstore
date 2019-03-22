package jstore;

public enum ItemCategory
{
    ELECTRONICS("Electronics"), FURNITURE("Furniture"), STATIONERY("Stationery");
    private String value;
    
    private ItemCategory(String value)
    {
        this.value=value;
    }
}