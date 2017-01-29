package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Airtransport extends Transport {
    private Integer maxHeight;

    public String toString(){
        return "Воздушный транспорт";
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
    }
}
