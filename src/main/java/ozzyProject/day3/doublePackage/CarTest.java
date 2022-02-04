package ozzyProject.day3.doublePackage;

import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        Supplier<Car> c1 = Car::new;
        c1.get().getModel();

        Supplier<Car>c2=Car::new;

        System.out.println(c2.get().getModel());
    }
}
