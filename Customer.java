package jstore;

import java.util.*;
import java.text.*;
import java.util.regex.*;


/**
 * Write a description of class Customer here.
 *
 * @author Yelli Yulfita
 * @version 25-03-2018
 */
public class Customer
{
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    
    public Customer(String name, String email, String username,
                    String password, Calendar birthDate)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
		
		id = DatabaseCustomer.getLastCustomerId() + 1;
    }           

    public Customer(String name, String email, String username,
                    String password, int year, int month,
                    int dayOfMonth)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
		
		id = DatabaseCustomer.getLastCustomerId() + 1;
        
    }   

    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
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
        SimpleDateFormat dformat = new SimpleDateFormat(
                                    "dd MMMM YYY");
        //System.out.printf("%1$s %2$td %2$tB %2$tY", "Birth date: ",
        //                  birthDate);                         
        System.out.println("Birth date: " + dformat.format(
                            birthDate.getTime()));
        
        return birthDate;
    }
    
    
    
    ///////////////////////////////////////////////////////////
    
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if(m.matches())
        {
            System.out.println("Format email benar");
            this.email = email;
        }
        else
        {
            System.out.println("Format email salah");
            this.email = null;
        }
    }   

    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
        
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        
        if(m.matches())
        {
            System.out.println("Format password benar");
            this.password = password;
        }
        else
        {
            System.out.println("Format password salah");
            this.password = null;
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
        return  "===========CUSTOMER===========" + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Username: " + username + "\n" +
                "Password: " + password + "\n" +
                "ID: " + id + "\n" +                
                "Birth date: " 
                    + birthDate.getTime() + "\n";
    }
        public void print()
    {
        System.out.println(toString());
    }
}
