package jstore;


/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    public Location(){
    }
    private String province;
    private String description;
    private String city; 
    public String getProvince() {
        return "kosong";
    }
    
    public String getCity() {
        return "kosong";
    }
    public String getDescription(){
        return "kosong";
    }
    public void setProvince (String province){
        this.province =province;
    }
    public void setCity (String city) {
        this.city = city;
        
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void printData(){
        System.out.println("provinsi");
}
}
        

