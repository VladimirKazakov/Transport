package january.Jan2617;


public class Helicopter extends Airtransport {

    private Integer bladeLength;

    public String toString(){
        return  "Вертолет";
    }

    public void setBladeLength(Integer bladeLength) {
        this.bladeLength = bladeLength;
    }

    public Integer getBladeLength() {
        return bladeLength;
    }

    public Helicopter(Integer bladeLength) {
        this.bladeLength = bladeLength;
    }
}

