import com.AppConfig;
import com.service.CustomerService;
import com.service.ICustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String [] args){

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
                //new ClassPathXmlApplicationContext("applicationContext.xml");

        //CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);

        CustomerService customerService =
                applicationContext.getBean("customerService", CustomerService.class);


        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
