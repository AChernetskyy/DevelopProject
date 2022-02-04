package ozzyProject.day4.stream;

import java.util.Arrays;
import java.util.List;

public class StreamOparations {
    public static void main(String[] args) {
        List<Integer>myList= Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,5,34,3);
        //myList.forEach(System.out::println);

        //Filter
       // myList.stream().filter(i->i%3==0).distinct().forEach(System.out::println);

        //LIMIT
        myList.stream().filter(i->i%2==0).limit(1).toArray();

        //MAP
        //myList.stream().map(number->number*2).filter(i->i%3==0).forEach(System.out::println);
        List<String>words=Arrays.asList("JAVA", "APPLE","HONDA", "DEVELOPER");
        words.stream().map(String::length).forEach(System.out::println);



    }
}
