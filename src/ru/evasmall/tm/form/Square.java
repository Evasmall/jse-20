package ru.evasmall.tm.form;

public class Square extends Shape {
    private final double l;

    public Square(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    @Override
    public Double getArea() {
        return l*l;
    }


}
