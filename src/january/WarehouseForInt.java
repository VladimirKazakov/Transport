package january;
public class WarehouseForInt {
    int[] array;
    int size;

    public WarehouseForInt() {
        array = new int[5];
        size = 0;
    }

    public void add(int newElement) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = newElement;
    }

    public void removeByIndex(int index) {
        if (index < 0 && index > size) {
            System.out.println("Выход за пределы хранилища");
            return;
        }
        for (int i = index; i < size - 1; i++)
            array[i] = array[i + 1];
        size--;

        if (size * 3 <= array.length) {
            int[] newArray = new int[array.length / 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void removeByValue(int value) {
        for (int i = 0; i < size; i++)
            if (array[i] == value) {
                this.removeByIndex(i);
                return;
            }
    }

    public void removeAllByValue(int value) {
        for (int i = 0; i < size; i++)
            if (array[i] == value) {
                this.removeByIndex(i);
            }
    }

    public int searchByValue(int value) {
        for (int i = 0; i < size; i++)
            if (array[i] == value)
                return i;
        return -1;
    }

    public void addArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            this.add(array[i]);
    }

    public void addToCurrentWarehouse(WarehouseForInt object) {
        for (int i = 0; i < object.getCount(); i++)
            this.add(object.getElement(i));
    }

    public WarehouseForInt addWarehouse(WarehouseForInt object) {
        WarehouseForInt newHouse = new WarehouseForInt();
        newHouse.addToCurrentWarehouse(this);
        newHouse.addToCurrentWarehouse(object);
        return newHouse;
    }

    public int getElement(int index) {
        return array[index];
    }

    public int getCount() {
        return size;
    }

    public int getRealSize() {
        return array.length;
    }
}