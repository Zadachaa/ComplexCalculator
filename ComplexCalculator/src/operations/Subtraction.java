package operations;

import model.ComplexNumber;

import java.util.logging.*;

public class Subtraction implements Operation {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double newImaginary = a.getImaginary() - b.getImaginary();
        log.fine("newImaginary = " + newImaginary);
        double newReal = a.getReal() - b.getReal();
        log.fine("newReal = " + newReal);
        return new ComplexNumber(newImaginary, newReal);
    }
}
