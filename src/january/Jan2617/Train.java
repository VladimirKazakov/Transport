package january.Jan2617;

/**
 * Created by А д м и н on 26.01.2017.
 */
public class Train extends Groundtransport {
    private Integer maxCarriage;

    public String toString(){
        return "Железнодорожный трансорт: ";
    }
public Integer getMaxCarriage(){
    return maxCarriage;
}
public void setMaxCarriage(Integer maxCarriage){
    this.maxCarriage=maxCarriage;
}

}
