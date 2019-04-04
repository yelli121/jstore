
import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password,int id,Calendar birthDate)
    {
       this.name = name;
       this.email = email;
       this.username = username;
       this.password = password;
       this.id = id;
       this.birthDate = birthDate;
    }
    public Customer(String name, String email, String username, String password,int id,int year, int month, int dayOfMonth)
    {
       this.name = name;
       this.email = email;
       this.username = username;
       this.password = password;
       this.id = id;
       this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
    public int getId()
    {
        return id;
    }
    public Calendar getBirthDate()
    {
        System.out.printf("%1$s %2$tB %2$tY","Birth date:", birthDate);
        return birthDate;
    }
    
    /*public Calendar getBirthDate(){
        System.out.println("Birth Date: " + birthDate.get(Calendar.DATE) + " " + 
        birthDate.get(Calendar.MONTH) + " " +  birthDate.get(Calendar.YEAR));
        return birthDate;
    }*/
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
         String emailRegex = "^[a-zA-z0-9_+&*-]+(?:\\."+
                            "[a-zA-z0-9_+&*-]+)*@" +
                            "(?:[a-zA-z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        Matcher matcher = pat.matcher(email);
        if (matcher.matches())
        {
            this.email = email;
        }
        else 
        {
            this.email = null;
        }
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group());
        }else{
            System.out.println("Password: NULL");
        }
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate = birthDate;
    }
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
    }
    public String toString()
    {
        return "";
    }
}