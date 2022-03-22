import chapter3.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 2022/3/22
 * desc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertHolderTest {
    @Autowired
    private DessertHolder dessertHolder;

    @Test
    public void name() {
        Dessert dessert1 = dessertHolder.getScreamyDessert();
        Assert.assertTrue(dessert1 instanceof IceCream);
        Dessert dessert2 = dessertHolder.getFruityDessert();
        Assert.assertTrue(dessert2 instanceof Popsicle);
    }
}
