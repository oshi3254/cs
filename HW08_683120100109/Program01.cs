using System.Drawing;

namespace cs_HW08_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Circle c = new Circle(8);
            c.shapeInfo();

            Rectangle r = new Rectangle(4, 6);
            r.shapeInfo();

            Cylinder cy = new Cylinder(4, 10);
            Console.WriteLine($"Cylinder Volume = {cy.Volume()}");
        }

        abstract class Shape
        {
            protected string name;
            public Shape(string name)
            {
                this.name = name;
            }

            public abstract double Area();
            public void shapeInfo()
            {
                Console.WriteLine($"{name} {Area()}");
            }
        }

        class Circle : Shape
        {
            protected double radius;
            public Circle(double radius) : base("Circle")
            {
                this.radius = radius;
            }
            public override double Area()
            {
                return Math.PI * radius * radius;
            }

        }

        class Rectangle : Shape
        {
            protected double widt, height;
            public Rectangle(double widt, double height) : base("Recangle")
            {
                this.widt = widt;
                this.height = height;
            }
            public override double Area()
            {
                return widt * height;
            }
        }

        class Cylinder : Circle
        {
            private double length;

            public Cylinder(double radius, double length) : base(radius)
            {
                name = "Cylinder";
                this.length = length;
            }

            public double Volume()
            {
                return Area() * length;
            }
        }

    }
}

