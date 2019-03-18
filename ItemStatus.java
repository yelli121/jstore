package jstore;


/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author Yelli Yulfita
 * @version 14-03-2019
 */
public enum ItemStatus
{
    New, Second, Refurbished, Sold{
    
public String toString()
{
    return "New, Second, Refurbished, Sold";
}
}
}

