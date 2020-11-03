
package javaapplication2.test;
import javaapplication2.domain.Customer;


/**
 *
 * @author Я
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer custom = new Customer();
        custom.displayCustomerInfo();
        custom.getId();
        custom.getTotal();
        custom.setId(100);
        custom.setIsNew(false);
        custom.setTotal(1250.3f);
        custom.displayCustomerInfo();
             
        
    }
    
}
