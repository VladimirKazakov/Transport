package january;

/**
 * Created by А д м и н on 24.01.2017.
 */
public class Square extends GeometricFigures {



    public void area() {
        int s=1;
        s=lenght*lenght;
        System.out.println("площадь квадрата: " + s );
    }
    public void perimeter(){
        int p;
        p=4*lenght;
        System.out.println("Перимет квадрата: " +p);
    }
}
