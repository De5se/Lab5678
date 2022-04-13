package Commands;

import static java.lang.System.exit;

public class Exit extends AbstractCommand {
    public Exit() {
        super("exit", "завершить программу (без сохранения в файл)");
    }

    public void execute() {
        System.out.println("Пока");
        exit(0);
    }
}
