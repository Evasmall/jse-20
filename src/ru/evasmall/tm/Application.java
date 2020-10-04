package ru.evasmall.tm;

import ru.evasmall.tm.form.Circle;
import ru.evasmall.tm.form.Rectangle;
import ru.evasmall.tm.form.Square;
import ru.evasmall.tm.form.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Application {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	System.out.println("Программа по расчету площадей геометрических фигур.");
	    //Площадь кругов
        try {
            final Collection<Circle> circles = new ArrayList<>();
            System.out.println("Радиус первого круга:");
            double r1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Радиус второго круга:");
            double r2= Double.parseDouble(scanner.nextLine());
            addShape(circles, new Circle(r1), new Circle(r2));
            System.out.println("Площадь кругов: " + getSum(circles));
            System.out.println("_________________________");

            //Площадь прямоугольников
            final Collection<Rectangle> rectangles = new ArrayList<>();
            System.out.println("Длина первого прямоугольника:");
            double a1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Ширина первого прямоугольника:");
            double b1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Длина первого прямоугольника:");
            double a2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Ширина первого прямоугольника:");
            double b2 = Double.parseDouble(scanner.nextLine());
            addShape(rectangles, new Rectangle(a1, b1), new Rectangle(a2, b2));
            System.out.println("Площадь прямоугольников: " + getSum(rectangles));
            System.out.println("_________________________");

            //Площадь квадратов
            final Collection<Square> square = new ArrayList<>();
            System.out.println("Сторона первого квадрата:");
            double l1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Сторона второго квадрата:");
            double l2 = Double.parseDouble(scanner.nextLine());
            addShape(square, new Square(l1), new Square(l2));
            System.out.println("Площадь квадратов: " + getSum(square));
            System.out.println("_________________________");

            //Площадь коллекции фигур
            final Collection<Shape> shape = new ArrayList<>();
            System.out.println("Коллекция фигур");
            System.out.println("Радиус круга:");
            double r = Double.parseDouble(scanner.nextLine());
            System.out.println("Длина прямоугольника:");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Ширина прямоугольника:");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Сторона квадрата:");
            double l = Double.parseDouble(scanner.nextLine());
            addShape(shape, new Circle(r), new Rectangle(a, b), new Square(l));
            System.out.println("Площадь коллекции фигур: " + getSum(shape));
            System.out.println("_________________________");
        }
        catch (NumberFormatException e) {
            System.out.println("Значение некорректного формата! Ошибка.");
        }
    }

    private static <T extends Shape> void addShape(final Collection<T> collection, final T...shapes) {
        collection.addAll(Arrays.asList(shapes));
    }

    private static <T extends Shape> String getSum(final Collection<T> collection) {
        double sum = 0.;
        for (T shape: collection){
            sum = sum + shape.getArea();
        }
        return String.format("%.3f",sum);
    }

}
