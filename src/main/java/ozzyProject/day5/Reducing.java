package ozzyProject.day5;

import ozzyProject.day5.dishTask.DishData;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5);

        int result= numbers.stream().reduce(6,(a,b)->a+b);
        System.out.println(result);

        int dishCount=DishData.getAll().stream().map(d->1).reduce(0,(a,b)->a+b);
        System.out.println(dishCount);

        long dishLong=DishData.getAll().stream().count();
        System.out.println(dishLong);
    }
}
