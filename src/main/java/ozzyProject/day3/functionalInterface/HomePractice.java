package ozzyProject.day3.functionalInterface;

import ozzyProject.day2_Lambda_Lombok.appleSorting.Apple;
import ozzyProject.day2_Lambda_Lombok.appleSorting.Color;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class HomePractice {
    public static void main(String[] args) {
        Apple apple=new Apple();
        List<Apple>apples= Arrays.asList(
                new Apple(10,Color.GREEN),
                new Apple(10,Color.RED),
                new Apple(10,Color.GREEN),
                new Apple(10,Color.RED)
        );



        Predicate<Apple>green=apple1 -> apple1.getWeight()>150;
        green.test(apple);

        Predicate<Integer>check=p->new Apple().getWeight()>150;
        Consumer<Apple>set=a->a.setWeight(100);
        set.accept(apple);
        Function<Apple,Integer> checkF=p->apple.getWeight()>50 ? 5:10;

        System.out.println(checkF.apply(new Apple()));


        System.out.println("Predicate "+check.test(120));

        //System.out.println(test.get().getColor());

        Consumer<Apple>setWeight=a->a.setWeight(50);
        setWeight.accept(apple);
      //  BiConsumer<Integer,String> check3 = (x,y)->{new Apple().setWeight(x), new Apple().setColor(Color.GREEN)};

        System.out.println(apple.toString());

        Function<Apple,String>mod=p->"Get well";
        System.out.println(mod.apply(apple));

        System.out.println(mod.apply(apple).length());

        Supplier<Integer>random=()->Math.abs(5);

        System.out.println( random.get());
        Supplier<Color>random1=()->apple.getColor();


    }

}
