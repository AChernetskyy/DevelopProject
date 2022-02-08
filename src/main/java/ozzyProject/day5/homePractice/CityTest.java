package ozzyProject.day5.homePractice;

import java.util.*;
import java.util.stream.Stream;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class CityTest {
    public static void main(String[] args) {
        State florida= new State("Florida",Arrays.asList("Miami","Tampa","Naples","Parkland"),10);
        State illinois=new State("Illinois",Arrays.asList("Chicago","Niles","Glencoe"),20);
        State NY=new State("NY",Arrays.asList("NY","Brooklyn","Long Island"),30);
        List<State>allStates=Arrays.asList(florida,illinois, NY);
        allStates.stream().map(a->a.getCities()).forEach(System.out::println);

        // Print length of each city from Array List or List
        //allStates.stream().flatMap(a->a.getCities().stream()).map(a->a.length()).forEach(System.out::println);

        // Print highest population state
       // allStates.stream().sorted(comparing(State::getStatePopulation).reversed()).map(State::getStatePopulation).limit(1).forEach(System.out::println);

        //allStates.stream().flatMap(a->a.getCities().stream()).forEach(System.out::println);

        //Using reduce() to find min, max and sum
        System.out.println("***********reducer****************");
        allStates.stream().map(State::getStatePopulation).reduce(Integer::max).ifPresent(i-> System.out.println("State has "+i+" mil population "));
        Optional<Integer>max = allStates.stream().map(State::getStatePopulation).reduce(Integer::max);
        System.out.println("Count number of cities");
        allStates.stream().map(a->a.getCities().size()).forEach(System.out::println);

        System.out.println("***************Return Long*****************");
        Long totalCities=
        allStates.stream().map(State::getCities).count();
        System.out.println(totalCities);

        System.out.println("***************Using Reduce*****************");
        int totalReduce=
        allStates.stream().map(d->1).reduce(0,(a,b)->a+b);
        System.out.println(totalReduce);

        System.out.println("*****************Iterate/Fibonacci*******************");
        Stream.iterate(new int []{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(8).forEach(t-> System.out.print(t[1]+", "));


    }
    }

