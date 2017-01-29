package january;


public class Circle extends GeometricFigures {


    public void area(){
        double s;
        s= 3.14*lenght*lenght;
        System.out.println("Площадь круга:  " +s);
    }
    public void perimeter(){
        double p;
         p= 2*3.14*lenght;
        System.out.println("Окружность круга: " +p);
    }

}
