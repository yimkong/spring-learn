import bean.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author yg
 * description
 * date 2020/3/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/SpringTest-context.xml"})
public class SpringTest {
    @Autowired
    MyTestBean myTestBean;
    @Test
    public void testLoad() {
        Assert.assertEquals(myTestBean.getStr(), "test");
    }
}
