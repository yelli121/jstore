package jstore;

import java.util.*;

/**
 * Mendefinisikan dokumentasi detail pembelian. Setiap pembelian 
 * yang terjadi akan disimpan informasi detailnya, yaitu nomor id, 
 * tanggal, total pembayaran, dan termasuk objek Item. 
 *
 * @author Yelli Yulfita
 * @since 28-2-2019
 */

public abstract class Invoice
{
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.item = item;
        this.date = Calendar.getInstance();
        id = DatabaseInvoice.getLastInvoiceId()+1;
        for(Integer i : this.item)
        {
            totalPrice = totalPrice + DatabaseItem.getItemFromId(i.intValue()).getPrice();
        }
    }
    /**
     * Method getId
     *
     * @param  -
     * @return id
     */
    public int getId()
    {
        return id;
    }
    /**
     * Method getItem
     *
     * @param  -
     * @return item
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    /**
     * Method getDate
     *
     * @param  -
     * @return date
     */
    public Calendar getDate()
    {
        return date;
    }
    /**
     * Method getTotalPrice
     *
     * @param  -
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    /**
     * Method getInvoiceStatus
     *
     * @param  -
     * @return -
     */
    public abstract InvoiceStatus getInvoiceStatus();
    /**
     * Method getInvoiceType
     *
     * @param  -
     * @return -
     */
    public abstract InvoiceType getInvoiceType();
    /**
     * Method getIsActive
     *
     * @param  -
     * @return isActive
     */
    public boolean getIsActive()
    {
        return isActive;
    }
    /**
     * Method getCustomer
     *
     * @param  -
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer;
    }
    /**
     * Method setId
     *
     * @param  id
     * @return -
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * Method setItem
     *
     * @param  item
     * @return -
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }
    /**
     * Method setDate
     *
     * @param  date
     * @return -
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    /**
     * Method setTotalPrice
     *
     * @param  totalPrice
     * @return -
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    /**
     * Method setInvoiceStatus
     *
     * @param  status
     * @return -
     */
    public abstract void setInvoiceStatus (InvoiceStatus status);

    /**
     * Method setIsActive
     *
     * @param  isActive
     * @return -
     */
    public void setIsActive (boolean isActive)
    {
        this.isActive = isActive;
    }
    /**
     * Method toString prints out invoice info.
     *
     * @param  -
     * @return -
     */
    public abstract String toString();
}