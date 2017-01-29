package january;

import java.awt.*;

public class Launcher {


    public static void mai2345234523452345n(String[] args) {
        Animal gosha = new Goat();
        Goat goat = (Goat) gosha;


    }

    public static void main234234234(String[] args){
        Animal first = new Goat();

        if(first instanceof  Goat) {
            System.out.println("Я коза!");
            Goat goat = (Goat) first;
            goat.milkVolume = 1.1;
            goat.butt();
        }

        if(first instanceof  Giraffe)
            System.out.println("Я жираф!");
    }









    public static void main1223412341234(String[] args) {

        Animal[] zooChijovka = new Animal[5];
        zooChijovka[0] = new Goat();
        zooChijovka[1] = new Goat();
        zooChijovka[2] = new Giraffe();
        zooChijovka[3] = new Giraffe();
        zooChijovka[4] = new Goat();

        for (int i = 0; i < zooChijovka.length; i++)
            zooChijovka[i].makeNoise();

    }



    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.name = "Mashka";
        goat.milkVolume = 3434.4;

        Giraffe giraffeGeek = new Giraffe();
        giraffeGeek.name = "Gosha";
        giraffeGeek.friendsName = "Java";




        Animal a1 = new Giraffe();
        Animal a2 = new Goat();
        a1.name = "Ola";
        a1.name = "Dasha";
        a2.name = "Gosha";

        Animal[] zooChijovka = new Animal[5];
        zooChijovka[0] = new Goat();
        zooChijovka[1] = new Goat();
        zooChijovka[2] = new Giraffe();
        zooChijovka[3] = new Giraffe();
        zooChijovka[4] = new Goat();

        for(int i=0; i<5; i++) {
            if(zooChijovka[i] instanceof Goat){
                System.out.println("Козочка говорит: ");
            } else if(zooChijovka[i] instanceof Giraffe){
                System.out.println("Жираф говорит: ");
            } else {
                System.out.println("Ты КТО???");
            }



            zooChijovka[i].makeNoise();
        }





    }

















    public static void main21342432(String[] args) {
        Giraffe gosha = new Giraffe();
        gosha.name = "Gosha";
        gosha.color = Color.BLACK;
        gosha.legsCount = 4;


        Goat masha = new Goat();
        masha.name = "Masha";
        masha.milkVolume = 44.3;
        masha.owner = "Petr";

        Giraffe[] giraffes = new Giraffe[10];
        Goat[] goats = new Goat[10];
//А как сделать такой массив где можно хранить и Ж и К?

// Если мы решили что любое животное имеет новый параметр
// (в нашем случае мы придумали СРЕДУ ОБИТАНИЯ)
// То нам надо менять все в каждом классе

        //ВРоде и жираф и коза животные
        //нам надо уметь работать одновременно и с тем и с тем
        //(ЛЮБОЙ ИХ НИХ ИМЕЕТ ИМЯ)
        //нам надо уметь хранить их вместе (в одном массиве_
        //МАССИВ ЖИВОТНЫХ ИЗ КОЗ И ЖИРАФОВ
        //нам надо иметь возможность быстро менять общие параметры


    }
}
