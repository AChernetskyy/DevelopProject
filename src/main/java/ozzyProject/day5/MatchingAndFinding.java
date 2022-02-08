package ozzyProject.day5;

import ozzyProject.day5.dishTask.Dish;
import ozzyProject.day5.dishTask.DishData;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        //All Match
        boolean isHealthy = DishData.getAll().stream().allMatch(p->p.getCalories()<1000);

        //Any Match
        DishData.getAll().stream().anyMatch(Dish::isVegetarian);
        boolean someHealthy=DishData.getAll().stream().anyMatch(p->p.getCalories()>100 || p.getCalories()<100);

        //None Match
        DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=100 || dish.getCalories()<50);

        //Find Any
        Optional<Dish>dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //Find First
        Optional<Dish>dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish.get());

    }

}
