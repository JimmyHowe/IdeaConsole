import com.jimmyhowe.ideaconsole.colors.BootstrapColors;
import com.jimmyhowe.ideaconsole.IdeaConsole;

public class Main
{
    public static void main(String[] args)
    {
        IdeaConsole.use(new BootstrapColors());

        IdeaConsole.out("Standard");
        IdeaConsole.primary("Primary");
        IdeaConsole.secondary("Secondary");
        IdeaConsole.success("Success");
        IdeaConsole.info("Info");
        IdeaConsole.warning("Warning");
        IdeaConsole.danger("Danger");
    }
}
