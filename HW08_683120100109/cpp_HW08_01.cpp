#define _USE_MATH_DEFINES
#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class Shape {
protected:
    string name;
public:
    Shape(string n) : name(n) {}
    virtual double area() = 0;

    void shapeInfo() {
        cout << name << " Area = " << area() << endl;
    }
};

class Circle : public Shape {
protected:
    double radius;
public:
    Circle(double r) : Shape("Circle"), radius(r) {}
    double area() override {
        return M_PI * radius * radius;
    }
};

class Rectangle : public Shape {
protected:
    double width, height;
public:
    Rectangle(double w, double h)
        : Shape("Rectangle"), width(w), height(h) {
    }
    double area() override {
        return width * height;
    }
};

class Cylinder : public Circle {
    double length;
public:
    Cylinder(double r, double l) : Circle(r), length(l) {
        name = "Cylinder";
    }
    double volume() {
        return area() * length;
    }
};

int main() {
    Circle c(4);
    c.shapeInfo();

    Rectangle r(4, 6);
    r.shapeInfo();

    Cylinder cy(3, 9);
    cout << "Cylinder Volume = " << cy.volume() << endl;

    return 0;
}
