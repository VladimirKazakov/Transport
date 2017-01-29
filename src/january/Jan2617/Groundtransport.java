package january.Jan2617;


public class Groundtransport extends Transport {
    private Integer availabilityOfRail;

    public String toString(){
        return "Наземный транспорт";

    }
    public void setAvailabilityOfRail(Integer availabilityOfRail){
        this.availabilityOfRail=availabilityOfRail;

    }
    public Integer getAvailabilityOfRail(){
        return availabilityOfRail;
    }


}
