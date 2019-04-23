import com.service.CustomerServiceImpl;
import com.service.ICustomerServiceImpl;

public class Application {

    public static void main(String [] args){
        ICustomerServiceImpl customerService = new CustomerServiceImpl();

        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
