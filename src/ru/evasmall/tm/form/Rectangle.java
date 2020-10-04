package ru.evasmall.tm.form;

public class Rectangle extends Shape {

    private final double a;

    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public Double getArea() {
        return a*b;
    }

}
