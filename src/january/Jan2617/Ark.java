package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Ark extends Watertransport {
    private Integer screwMotor;

    public String toString(){
        return "Ковчег";
    }
    public void setScrewMotor(Integer screwMotor){
        this.screwMotor=screwMotor;

    }
    public Integer getScrewMotor(){
        return screwMotor;
    }

}
