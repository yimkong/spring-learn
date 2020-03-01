import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author yg
 * description
 * date 2020/3/1
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
    }
}
