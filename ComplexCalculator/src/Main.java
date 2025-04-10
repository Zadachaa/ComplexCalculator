import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static java.util.logging.FileHandler fh = null;

    private static void initLogger() {
        try {
            fh = new FileHandler("calculator.log", false);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        Logger l = Logger.getLogger("");
        fh.setFormatter(new SimpleFormatter());
        l.addHandler(fh);
        l.setLevel(Level.FINE);
    }

    public static void main(String[] args) {
        initLogger();
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.run(scanner);
        scanner.close();
    }
}