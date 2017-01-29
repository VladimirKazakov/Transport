package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Watertransport extends Transport {
    private Integer     waterOrUnderwater;
    public String toString(){
        return "Водный транспорт";
    }
    public void setWaterOrUnderwater(Integer waterOrUnderwater){
        this.waterOrUnderwater=waterOrUnderwater;
    }

    public Integer getWaterOrUnderwater(){
        return waterOrUnderwater;
    }
}
