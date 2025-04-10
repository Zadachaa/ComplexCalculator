package operations;

import java.util.logging.*;

import model.ComplexNumber;

public class Multiplication implements Operation {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double newReal = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        log.fine("newReal = " + newReal);
        double newImaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        log.fine("newImaginary = " + newImaginary);
        return new ComplexNumber(newImaginary, newReal);
    }
}
