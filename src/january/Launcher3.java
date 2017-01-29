package january;
import java.util.Random;
import java.util.Scanner;

public class Launcher3 {

    public static void print(WarehouseForInt object) {
        for (int i = 0; i < object.getCount(); i++)
            System.out.print(object.getElement(i) + " ");
        System.out.println();
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        WarehouseForInt domik1 = new WarehouseForInt();
        WarehouseForInt domik2 = new WarehouseForInt();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            domik1.add(random.nextInt(20));
            domik2.add(random.nextInt(20));
        }
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(20);
        System.out.print("Домик 1 - ");
        print(domik1);
        System.out.print("Домик 2 - ");
        print(domik2);
        System.out.print("Масив - ");
        print(array);
        System.out.print("Удалить по индексу - ");
        int index = scanner.nextInt();
        domik1.removeByIndex(index);
        print(domik1);
        System.out.print("Поиск по значению - ");
        int value = scanner.nextInt();
        index = domik1.searchByValue(value);
        System.out.println("Значение " + (index > -1 ? "расположено по индексу " + index : "не найдено"));
        System.out.println("Добавляем массив");
        domik1.addArray(array);
        print(domik1);
        System.out.println("Добавляем домик");
        domik1.addToCurrentWarehouse(domik2);
        print(domik1);
        System.out.println("Объединяем домики");
        WarehouseForInt domik3 = domik1.addWarehouse(domik2);
        print(domik3);
        System.out.print("Удалить все значения - ");
        value = scanner.nextInt();
        domik3.removeAllByValue(value);
        print(domik3);
        System.out.print("Удалить по значению - ");
        value = scanner.nextInt();
        domik3.removeByValue(value);
        print(domik3);
    }
}