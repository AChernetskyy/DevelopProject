package ozzyProject.day2_Lambda_Lombok.appleSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
/*
In software engineering, user requirements will change.
Example : Imagine an application to help a farmer understand his inventory.
- Find all green apples in the inventory
- Find all apples heavier than 200 g
As a developer, we have to minimize our engineering effort.

Strategy Design Pattern : which lets you define a family of algorithms,
encapsulate each algorithm, and select an algorithm at run time.
In this case the family of algorithm is ApplePredicate and the different
strategies are AppleHeavyWeightPredicate and AppleGreenColorPredicate.
 */

public class AppleTest {
    public static void main(String[] args) {
        ArrayList<Apple>inventory=new ArrayList<>();
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(150, Color.GREEN));
//        System.out.println(filter(inventory,new AppleGreen()));
//        System.out.println(filter(inventory,new AppleHeavy()));
        applesFormater(inventory, new AppleSimpleFormater());
        ArrayList<Apple>greenApple=filter(inventory, apple->apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple);

    }

    public static ArrayList<Apple>filter(ArrayList<Apple>apples, Predicate<Apple> condition) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (condition.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void applesFormater(ArrayList<Apple>inventory,AppleFormater appleFormater){
        for (Apple apple:inventory) {
            String output=appleFormater.accept(apple);
            System.out.println(output);
        }
    }
}
