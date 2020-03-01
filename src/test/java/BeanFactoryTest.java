import bean.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author yg
 * description
 * date 2020/3/1
 */
public class BeanFactoryTest {
    @Test
    public void testLoad() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
//        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("C:\\project\\spring-learn\\src\\main\\resources\\application.xml");
        MyTestBean beansOfType = (MyTestBean) classPathXmlApplicationContext.getBean("myTestBean");
        Assert.assertEquals(beansOfType.getStr(), "test");
    }
}
