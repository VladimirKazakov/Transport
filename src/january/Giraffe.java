package january;

import java.awt.*;

//по человеческому: Жираф является животным
//по программистки: Жираф наследуется от животного
//дословный расширенный перевод на русский
//Жираф имеет больше данных чем животное
//Жираф имеет все общее(что есть у всех животных)
//+ что то свое
public class Giraffe extends Animal {
    Color color;
    String friendsName;

    public void makeNoise() {
        System.out.println("Жжжжиираффф");
    }

}
