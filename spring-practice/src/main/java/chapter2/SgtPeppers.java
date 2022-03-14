package chapter2;

import org.springframework.stereotype.Component;

/**
 * 2022/3/14
 * desc
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{
    @Override
    public void play() {
        System.out.println("play SgtPeppers");
    }
}
