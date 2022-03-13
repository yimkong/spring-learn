import java.io.PrintStream;

/**
 * 2022/3/13
 * desc 吟游诗人,在骑士战斗的前后吟唱
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("fa la la, knight brave go go");
    }

    public void singAfterQuest(){
        stream.println("tee hee hee, brave knight did embark on a quest");
    }
}
