package ozzyProject.day3.doublePackage;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Calculate s1= Calculator::findSum;
        s1.calculate(10,20);

        Calculate s2=Calculator::findSum;
        s2.calculate(100,35);

        Calculator.findSum(30,50);

        //Reference to instance method
        Calculate m1=(x,y)->new Calculator().findMultiply(x,y);
        m1.calculate(5,6);

        Calculate m2= new Calculator()::findMultiply;
        m2.calculate(6,6);

        BiFunction<String, Integer, String>fn=(str,i)->str.substring(i);
        fn.apply("Developer",6);

        BiFunction<String, Integer, String>fn2=String::substring;
        System.out.println(fn2.apply("Dino", 2));

        Consumer<Integer>display = System.out::println;
        display.accept(20);
        Function<Integer,Double> check = MyClass::method;



    }
}
