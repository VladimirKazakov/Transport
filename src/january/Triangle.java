package january;


public class Triangle extends GeometricFigures {
    int sideB;
    int sideC;

    public void area(){
        double s;
        if(lenght>sideB&&lenght>sideC) {
            s = sideB * sideC / 2;

        }
           else if(sideB>lenght&&sideB>sideC){
                s=lenght*sideC/2;}
            else
                s=lenght*sideB/2;
        System.out.println("Площадь треугольника:  "+s);
        }
        public void perimeter(){
            int p;
            p=lenght+sideB+sideC;
            System.out.println("Периметр треугольника: " +p);
        }
}
