package ozzyProject.day3.doublePackage;

import lombok.Data;

@Data
public class Car {
    private String make;
    private int model;

    public Car(){

    }

    public Car(int model){
        this.model=model;
    }
    public Car(int model, String make){
        this.model=model;
        this.make=make;
    }
}
