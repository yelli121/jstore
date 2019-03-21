public enum ItemStatus
{
    NEW("New"), SECOND("Second"), REFURBISHED("Refurbished"), SOLD("Sold");
    private String value;
    
    private ItemStatus(String value)
    {
        this.value=value;
    }
}
