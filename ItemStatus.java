public enum ItemStatus
{
    New("New"),Second("Second"),Refurbished("Refurbished"),Sold("Sold");
    
    private String description;
    
    private ItemStatus(String description)
    {
        this.description=description;
    }
    
    public String toString()
    {
        return description;
    }
}