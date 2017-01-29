package january;

/**
 * Created by А д м и н on 24.01.2017.
 */
public class Launcher1 {
    public static void main(String[] args) {
        GeometricFigures square1 = new Square();
        Square square = (Square) square1;
        square.lenght = 3;
        square.area();
        square.perimeter();

        GeometricFigures rectanle1 = new Rectangle();
        Rectangle rectangle = (Rectangle) rectanle1;
        rectangle.lenght=4;
        rectangle.b=5;
        rectangle.area();
        rectangle.perimeter();

        GeometricFigures circle1= new Circle();
        Circle circle=(Circle) circle1;
        circle.lenght=5;
        circle.area();
        circle.perimeter();

        GeometricFigures triangle1 = new Triangle();
        Triangle triangle = (Triangle) triangle1;
        triangle.lenght=3;
        triangle.sideB=6;
        triangle.sideC=5;
        triangle.area();
        triangle.perimeter();


    }
}
