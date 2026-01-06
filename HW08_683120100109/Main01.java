//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Circle c = new Circle(4);
    c.shapeInfo();

    Rectangle r = new Rectangle(4, 6);
    r.shapeInfo();

    Cylinder cy = new Cylinder(3, 9);
    System.out.println("Cylinder Volume = " + cy.volume());

    Polygon p = new Polygon(4, 5, 3);
    System.out.println("Polygon Volume = " + p.volume());
    }

    abstract class Shape {
        protected String name;

        public Shape(String name) {
            this.name = name;
        }

        public abstract double area();

        public void shapeInfo() {
            System.out.println(name + " Area = " + area());
        }
    }

    class Circle extends Shape {
        protected double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        protected double width, height;

        public Rectangle(double width, double height) {
            super("Rectangle");
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    class Cylinder extends Circle {
        private double length;

        public Cylinder(double radius, double length) {
            super(radius);
            this.name = "Cylinder";
            this.length = length;
        }

        public double volume() {
            return area() * length;
        }
    }

    class Polygon extends Rectangle {
        private int n;

        public Polygon(double w, double h, int n) {
            super(w, h);
            this.name = "Polygon";
            this.n = n;
        }

        public double volume() {
            return area() * n;
        }
    }

