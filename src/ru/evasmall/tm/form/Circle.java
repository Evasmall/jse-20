package ru.evasmall.tm.form;

public class Circle extends Shape {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public Double getArea() {
        return Math.PI * r * r;
    }

}
