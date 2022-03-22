package chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 2022/3/22
 * desc
 */
@Component
public class DessertHolder {

    private Dessert screamyDessert;
    private Dessert fruityDessert;

    @Autowired
    @Cold
    @Creamy
    public void setScreamyDessert(Dessert dessert){
        this.screamyDessert = dessert;
    }

    @Autowired
    @Cold
    @Fruity
    public void setFruityDessert(Dessert dessert) {
        this.fruityDessert = dessert;
    }

    public Dessert getFruityDessert() {
        return fruityDessert;
    }

    public Dessert getScreamyDessert() {
        return screamyDessert;
    }
}
