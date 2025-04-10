import model.ComplexNumber;
import operations.Operation;
import operations.OperationUtils;

import java.util.Scanner;

public class Calculator {
    private Scanner in;

    public void run(Scanner scanner) {
        this.in = scanner;
        while (true) {
            System.out.println("Обработка первого числа");
            ComplexNumber first = readComplexNumber();
            System.out.println("Обработка второго числа");
            ComplexNumber second = readComplexNumber();
            Operation operation = null;
            while (operation == null) {
                operation = readOperation();
            }
            ComplexNumber result = operation.calculate(first, second);
            System.out.println("Результат вычислений: " + result);
        }
    }

    private ComplexNumber readComplexNumber() {
        System.out.print("Введите действительную часть: ");
        double real = in.nextDouble();

        System.out.print("Введите мнимую часть: ");
        double imaginary = in.nextDouble();
        return new ComplexNumber(imaginary, real);
    }

    private Operation readOperation() {
        System.out.print("Введите операцию: ");
        String operation = in.next();
        return OperationUtils.getOperation(operation);
    }
}
