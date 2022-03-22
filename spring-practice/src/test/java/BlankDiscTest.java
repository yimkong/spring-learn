import chapter2.BlankDisc;
import chapter2.CDPlayerConfig;
import chapter2.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * 2022/3/19
 * desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class BlankDiscTest {
    @Autowired
    BlankDisc blankDisc;

    @Test
    public void test() {
        Assert.notNull(blankDisc,"oh");
        blankDisc.play();

    }
}
