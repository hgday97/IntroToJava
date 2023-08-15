package OOPMechanisms;

// Abstraction is a programming concept that simplifies complex reality by modeling classes, 
// objects, or systems with essential properties and behaviors, while hiding unnecessary details.

public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle()
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}

abstract class GraphicObject {  // These would usually be public classes in separate files, but for demonstration purposes (clarity and space) I've put them in one
    int x, y;
    void moveTo(int newX, int newY) {
        System.out.println("move to x:" + x + " and y: " + y);
    }

    abstract void draw();
    abstract void resize();
}

class Circle extends GraphicObject { // This would also be a separate public class 
    void draw() {
        System.out.println("Drawing a circle");  // This would be the code for drawing the circle etc... but just placed with text for demonstation of abstraction
    }
    void resize() {
        System.out.println("Resizing the circle");
    }
}

class Rectangle extends GraphicObject { // This would also be a separate public class
    void draw() {
        System.out.println("Drawing a Rectangle");  // This would be the code for drawing the circle etc... but just placed with text for demonstation of abstraction
    }
    void resize() {
        System.out.println("Resizing the Rectangle");
    }
}
