package ozzyProject.day3.functionalInterface;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        // Predicate
//        Predicate<Integer>lesserThan = new Predicate<Integer>() { //Anonymous Class
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
        // Predicate
        Predicate<Integer>lesserThan=a->a<18;
        Boolean result= lesserThan.test(50);
        System.out.println(result);

        // Consumer

        Consumer<Integer>display = i-> System.out.println(i );
        display.accept(50);


        // BI CONSUMER

        BiConsumer<Integer,Integer>addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(100, 200);

        // FUNCTION

        Function<String, String>fun= s -> "Hello "+s;

        String str= fun.apply("Ozzy");
        System.out.println(str);

        // SUPPLIER

        Supplier<Double> random = ()-> Math.random();
        System.out.println(random.get());


    }
}
