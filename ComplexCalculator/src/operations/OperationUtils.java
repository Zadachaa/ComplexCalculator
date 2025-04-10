package operations;

import java.util.logging.*;

public class OperationUtils {
    private static final Logger log = Logger.getLogger(OperationUtils.class.getName());

    public static Operation getOperation(String operation) {
        switch (operation) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "/":
                return new Division();
            case "*":
                return new Multiplication();
            default: {
                System.out.println("введена неверная операция. Используйте одну из +-/*");
                log.fine("Неверная операция: " + operation);
                return null;
            }
        }
    }
}
