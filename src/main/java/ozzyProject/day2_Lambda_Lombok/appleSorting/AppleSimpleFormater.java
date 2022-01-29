package ozzyProject.day2_Lambda_Lombok.appleSorting;

public class AppleSimpleFormater implements AppleFormater{

    @Override
    public String accept(Apple apple) {
        return "Apple weight is "+apple.getWeight()+"g";
    }
}
