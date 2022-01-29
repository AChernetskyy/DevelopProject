package ozzyProject.day2_Lambda_Lombok.appleSorting;

public class AppleHeavy implements AppleCondition{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>=200;
    }
}
