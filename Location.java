
/**
 * Write a description of class Location here.
 *
 * @author Yelli Yulfita
 * @version 27-02-2019
 */
public class Location
{
    
    private String province; //variabel yang dipakai
    private String description;
    private String city; 
    //constructor
    public Location(String city,String province,String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }
    
    public String getProvince()//Menampilkan nama provinsi
    {
        return province;
    }
    
    /**
     * Metode getProvince()
     * @return province
     */
    
    public String getCity()//Menampilkan nama kota
    {
        return city;
    }
    
    /**
     * Metode getCity()
     * @return city
     */
    
    public String getDescription()//Menampilkan deskripsi lokasi
    {
        return description;
    }
    
    /**
     * Metode getDescription()
     * @return description
     */
    
    public void setProvince(String province)//Mengganti nama provinsi
    {
        this.province=province;
    }
    
    /**
     * Metode setProvince()
     * @param province
     */
    
    public void setCity(String city)//Mengganti nama kota
    {
        this.city=city;
    }
    
    /**
     * Metode setCity()
     * @param city
     */
    
    public void setDescription (String description)//Mengganti deskripsi
    
    {
        this.description=description;
    }
    
    /**
     * Metode setDescription()
     * @param description
     */
    
    public void printData()//Mencetak nama provinsi
    {
        System.out.println(province);
    }
    /**
     * Metode printData()
     */
}
     