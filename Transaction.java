



/**
 * @author Yelli Yulfita
 * @version 21-03-2019
**/

import java.util.ArrayList;
public class Transaction
{
    private static ArrayList<Integer> listItem = new ArrayList<Integer>();

    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     //     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(ArrayList<Integer> item)throws InvoiceAlreadyExistsException
    {
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     //     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(ArrayList<Integer> item)throws InvoiceAlreadyExistsException
    {
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     //     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderRefurbishedItem(ArrayList<Integer> item)throws InvoiceAlreadyExistsException
    {
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemPaid(ArrayList<Integer> item, Customer customer)throws InvoiceAlreadyExistsException
    {
        Invoice sellPaid = new Sell_Paid(listItem, customer);
        DatabaseInvoice.addInvoice(sellPaid);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(ArrayList<Integer> item, Customer customer)throws InvoiceAlreadyExistsException
    {
        Invoice sellUnpaid = new Sell_Unpaid(listItem, customer);
        DatabaseInvoice.addInvoice(sellUnpaid);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(ArrayList<Integer> item, Customer customer,
                                           int installmentPeriod)throws InvoiceAlreadyExistsException
    {
        Invoice sellInstall = new Sell_Installment(listItem, installmentPeriod, customer);
        DatabaseInvoice.addInvoice(sellInstall);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean finishTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        if(invoice.getInvoiceStatus() == InvoiceStatus.Unpaid
                || invoice.getInvoiceStatus() == InvoiceStatus.Installment)
        {
            invoice.setIsActive(false);
            invoice.toString();
            System.out.println("isActive : " + invoice.getIsActive());
            return true;
        }
        return false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean cancelTransaction(Invoice invoice)throws InvoiceNotFoundException
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        DatabaseInvoice.removeInvoice(invoice.getId());
        return true;
    }
}