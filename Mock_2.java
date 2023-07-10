package in.ineuron;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}



public class Mock_2 {


		public static void main(String[] args) {
			ShapeCalculator calculator = new ShapeCalculator();
			
			Shape rectangle = new Rectangle(4, 5);
			calculator.printArea( rectangle);
			
			Shape circle = new Circle(3);
			calculator.printArea(circle);
			
			Shape triangle = new Triangle(6, 2);
			calculator.printArea(triangle);
		}
	}
	 


