package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Boat extends Watertransport {
    private Integer    availabilityOfOars;

    public String toString(){
        return "Лодка";

    }
    public Integer getAvailabilityOfOars(){
        return availabilityOfOars;
    }
    public void setAvailabilityOfOars(Integer availabilityOfOars){
        this.availabilityOfOars=availabilityOfOars;
    }
}
