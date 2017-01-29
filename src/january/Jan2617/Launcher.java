package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Launcher {
    public static void main(String[] args) {


        Helicopter helicopter = new Helicopter(2000);
        System.out.println(helicopter.toString());
        helicopter.setBladeLength(5);
        helicopter.setMaxWeight(80);
        helicopter.setMaxHeight(15000);
        helicopter.setMaxSpeed(1400);
        helicopter.setMaxLoad(10);
        System.out.println("Максимальная высота полета: " + helicopter.getMaxHeight() + "м");
        System.out.println("Максимальная масса: " + helicopter.getMaxWeight() + "т");
        System.out.println("Длина лопасти: " + helicopter.getBladeLength() + "м");
        System.out.println("Максимальная скорость: " + helicopter.getMaxSpeed() + "км/ч");
        System.out.println("Максимальная грузоподъемность: " + helicopter.getMaxLoad() + "т");
        System.out.println();


        Plane plane = new Plane();
        plane.setMaxHeight(12000);
        plane.setWingLength(10);
        plane.setMaxLoad(40);
        plane.setMaxSpeed(1100);
        plane.setMaxWeight(70);
        System.out.println(plane.toString());
        System.out.println("Максимальная высота: " + plane.getMaxHeight() + "м");
        System.out.println("Размах крыла: " + plane.getWingLength() + "м");
        System.out.println("Максимальная грузоподъемность: " + plane.getMaxLoad() + "т");
        System.out.println("Максимальная скорость: " + plane.getMaxSpeed() + "км/ч");
        System.out.println("Максимальная масса: " + plane.getMaxWeight() + "т");
        System.out.println();




        Auto auto= new Auto();

        auto.setMaxLoad(20);
        auto.setMaxSpeed(350);
        auto.setMaxWeight(100);
        auto.setAvailabilityOfRail(null);
        auto.setGloveCompartment(6);
        System.out.println(auto.toString());
        if(auto.getAvailabilityOfRail()==null){
            System.out.println("Рельc нет");
        }
        else
            System.out.println(" Рельсы есть");
        System.out.println("Максимальная скорость: "+auto.getMaxSpeed()+"км/ч");
        System.out.println("Максимальная масса"+auto.getMaxWeight()+"т");
        System.out.println("Максимальная грузоподъемность: "+auto.getMaxLoad()+"т");
        System.out.println("Объем бардачка: "+ auto.getGloveCompartment()+"см3");
        System.out.println();


        Train train= new Train();
        System.out.println(train.toString());
        train.setMaxLoad(500);
        train.setAvailabilityOfRail(1);
        train.setMaxWeight(500);
        train.setMaxSpeed(200);
        train.setMaxCarriage(20);
        System.out.println("Максимальная скорость"+train.getMaxSpeed()+"км/ч");
        System.out.println("Максимальная масса"+train.getMaxWeight()+"т");
        if(train.getAvailabilityOfRail()==null) {
            System.out.println("Рельс нет");
        }
            else
            System.out.println("Рельсы есть");
        System.out.println("Максимальное количество вагонов"+ train.getMaxCarriage()+"шт");
        System.out.println("Максимальная грузоподъемность"+train.getMaxLoad()+"т");

        Ark ark= new Ark();
        System.out.println(ark.toString());
        ark.setMaxLoad(5);
        ark.setMaxSpeed(80);
        ark.setMaxWeight(11);
        ark.setScrewMotor(2);
        ark.setWaterOrUnderwater(null);
        System.out.println("Максимальная грузоподъемность: "+ark.getMaxLoad()+"т");
        System.out.println("Максимальная скорость: "+ ark.getMaxSpeed()+"км/ч");
        System.out.println("Максимальная масса: "+ark.getMaxWeight()+"т");
        System.out.println("Количество винтов: "+ ark.getScrewMotor()+"шт");
        if(ark.getWaterOrUnderwater()==null) {
            System.out.println("Надводный");
        }
        else
            System.out.println("Подводный");
        System.out.println();


        Boat boat= new Boat();
        System.out.println(boat.toString());
        boat.setMaxLoad(1);
        boat.setMaxSpeed(20);
        boat.setWaterOrUnderwater(null);
        boat.setMaxWeight(2);
        boat.setAvailabilityOfOars(2);
        System.out.println("Максимальная грузоподъемность: "+boat.getMaxLoad()+"т");
        System.out.println("Максимальная скорость"+boat.getMaxSpeed()+"км/ч");
        System.out.println("Количество весел: "+boat.getAvailabilityOfOars()+"шт");
        System.out.println("Максимальная масса: "+boat.getMaxWeight()+"т");
        if(boat.getWaterOrUnderwater()==null){
            System.out.println("Надводный");
        }
                    else
            System.out.println("Подводный");
        }

        }


    

