
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Yelli Yulfita
 * @version 14-03-2019
 */
public enum InvoiceStatus
{
    Paid, Unpaid, Installment{
        public String toString(){
            return "Paid, Unpaid, Installment";
        }
}
}

