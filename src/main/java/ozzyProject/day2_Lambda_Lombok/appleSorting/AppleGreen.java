package ozzyProject.day2_Lambda_Lombok.appleSorting;

public class AppleGreen implements AppleCondition{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
