package model;

public class ComplexNumber {
    private double imaginary;
    private double real;

    public ComplexNumber(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return real + " + i*" + imaginary;
    }
}
