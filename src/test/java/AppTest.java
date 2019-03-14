import com.yodlee.springdependencyinjection.consumer.ConsumerWithAnnotation;
import com.yodlee.springdependencyinjection.service.MessageService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.yodlee.springdependencyinjection.consumer"})
public class AppTest {
    private AnnotationConfigApplicationContext context;

    @Bean
    public MessageService getMessageService() {
        return new MessageService() {
            public boolean sendMessage(String message, String recepient) {
                System.out.println("message: " + message + ", recepient: " + recepient);
                return true;
            }
        };
    }

    @Before
    public void setContext() throws Exception {
        context = new AnnotationConfigApplicationContext(AppTest.class);
    }

    @After
    public void closeContext() throws Exception {
        context.close();
    }

    @Test
    public void test() {
        ConsumerWithAnnotation app = context.getBean(ConsumerWithAnnotation.class);
        Assert.assertTrue(app.processMessage("Hello", "gothsiddu@gmail.com"));
    }

}
