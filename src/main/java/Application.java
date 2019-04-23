import com.service.CustomerService;
import com.service.ICustomerServiceImpl;

public class Application {

    public static void main(String [] args){
        ICustomerServiceImpl customerService = new CustomerService();

        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
