package ozzyProject.day6;

import ozzyProject.day5.dishTask.Dish;
import ozzyProject.day5.dishTask.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollector {
    public static void main(String[] args) {
        List<Integer>num = Arrays.asList(1,1,2,3,4,5,2,3,4,5,6,7,8,9);

        //************************ToCollection*********************

        // Put it in ArrayList
        List<Integer>newNum = num.stream().filter(p->p%2==0).collect(Collectors.toCollection(ArrayList::new));

        // Put it to HashSet-->only unique
        Set<Integer>newSet = num.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(newSet);

        //***********************ToList*************************

        List<Integer>newNumList = num.stream().filter(p->p%2==0).collect(Collectors.toList());

        //************************toMap*********************
        Map<String,Integer> newMap=
        DishData.getAll().stream().collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(newMap);

        //************************Counting()****************
        System.out.println(num.stream().filter(p -> p % 2 != 0).collect(Collectors.counting()));

        //************************averaging*******************

        System.out.println(DishData.getAll().stream().collect(Collectors.averagingInt(Dish::getCalories)));

        //*****************Joining*********************
        List<String>str=Arrays.asList("Java", "C#", "C++");
        System.out.println(str.stream().collect(Collectors.joining(",")));
    }
}
