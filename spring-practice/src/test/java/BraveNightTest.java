import chapter1.BraveKnight;
import chapter1.Quest;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * 2022/3/13
 * desc
 */
public class BraveNightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQ =  mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQ);
        braveKnight.embarkOnQuest();
        verify(mockQ,times(1)).embark();
    }
}
