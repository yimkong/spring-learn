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
        ClassPathXmlApplicationContext listableBeanFactory = new ClassPathXmlApplicationContext("application.xml");
        MyTestBean beansOfType = (MyTestBean) listableBeanFactory.getBean("myTestBean");
        Assert.assertEquals(beansOfType.getStr(), "test");
    }
}
