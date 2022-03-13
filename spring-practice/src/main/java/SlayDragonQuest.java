import java.io.PrintStream;

/**
 * 2022/3/13
 * desc
 */
public class SlayDragonQuest implements Quest{
    private PrintStream stream;

    public SlayDragonQuest(PrintStream printStream){
        this.stream = printStream;
    }

    @Override
    public void embark() {
        stream.println("Embark slay dragon");
    }
}
