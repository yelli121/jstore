package jstore;


/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author Yelli Yulfita
 * @version 14-03-2019
 */
public enum ItemCategory
{
    Electronics, Furniture, Stationery{
        public String toString(){
            return "Electronics, Furniture, Stationery";
        }
}
}
