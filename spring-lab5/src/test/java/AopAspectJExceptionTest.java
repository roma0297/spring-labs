import aop.AopLog;
import model.Bar;
import model.Customer;
import model.CustomerBrokenException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")

public class AopAspectJExceptionTest {

    @Autowired
    private Bar bar;

    @Autowired
    private Customer customer;

    @Before
    public void setUp() throws Exception {

//        customer.setBroke(true);
    }

    @Test(expected = CustomerBrokenException.class)
    public void testAfterThrowingAdvice() {

        bar.sellSquishee(customer);

        assertTrue("Customer is not broken ", AopLog.getStringValue().contains("Hmmm..."));
        System.out.println(AopLog.getStringValue());
    }
}