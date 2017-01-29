package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Plane extends Airtransport{
    private Integer wingLength;

    public String toString(){

        return "Самолет";
    }

    public Integer getWingLength() {
        return wingLength;

    }

    public void setWingLength(Integer wingLength) {
        this.wingLength = wingLength;
    }
}
