package ozzyProject.day3.doublePackage;

import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        Supplier<Car> c1 = ()->new Car();
        c1.get().getModel();

        Supplier<Car>c2=Car::new;
        c2.get().getModel();
    }
}