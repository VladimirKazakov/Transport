package january;

public class Rectangle extends GeometricFigures {
    int b;
public void area(){
    int s=1;
    s=lenght*b;
    System.out.println("Площадь прямоугольника: " +s);
}
 public void perimeter(){
     int p;
     p=lenght*2+b*2;
     System.out.println("Периметр прямоугольника: " +p);
 }
}
