package operations;

import model.ComplexNumber;

import java.util.logging.Logger;

public class Division implements Operation {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realNumerator = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary());
        log.fine("realNumerator = " + realNumerator);
        double realDenominator = (b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary());
        log.fine("realDenominator = " + realDenominator);
        double newReal = realNumerator / realDenominator;
        log.fine("newReal = " + newReal);
        double imaginaryNumerator = (b.getReal() * a.getImaginary() - a.getReal() * b.getImaginary());
        log.fine("imaginaryNumerator = " + imaginaryNumerator);
        double imaginaryDenominator = (b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary());
        log.fine("imaginaryDenominator = " + imaginaryDenominator);
        double newImaginary = imaginaryNumerator / imaginaryDenominator;
        log.fine("newImaginary = " + newImaginary);
        return new ComplexNumber(newImaginary, newReal);
    }
}
