import math

class Shape:
    def __init__(self, name: str):
        self.name = name

    def area(self) -> float:
        return 0.0

    def shapeInfo(self):
        print(f"Shape: {self.name}, Area = {self.area():.2f}")


class Circle(Shape):
    def __init__(self, radius: float):
        super().__init__("Circle")
        self.radius = radius

    def area(self) -> float:
        return math.pi * self.radius ** 2


class Rectangle(Shape):
    def __init__(self, width: float, height: float):
        super().__init__("Rectangle")
        self.width = width
        self.height = height 

    def area(self) -> float:
        return self.width * self.height


class Cylinder(Circle):
    def __init__(self, radius: float, length: float):
        super().__init__(radius)
        self.length = length
        self.name = "Cylinder"

    def volume(self) -> float:
        return self.area() * self.length


class Polygon(Rectangle):
    def __init__(self, width: float, height: float, n: int):
        super().__init__(width, height)
        self.n = n
        self.name = "Polygon"

    def volume(self) -> float:
        return self.area() * self.n
#######################################################################
c = Circle(5)
c.shapeInfo()

r = Rectangle(4, 6)
r.shapeInfo()

cy = Cylinder(3, 9)
print("Cylinder volume =", cy.volume())

p = Polygon(4, 5, 3)
print("Polygon volume =", p.volume())