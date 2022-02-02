package ozzyProject.day4.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating Stream from Array
        String[]coureses={"Java","JS", "TS"};
        Stream<String>corseStream=Arrays.stream(coureses);
        //Creating Stream from Collection
        List<String>corseList=Arrays.asList("Jave", "JS", "DS", "Spring");
        Stream<String>corseStream2=corseList.stream();

        List<Course>myCourse=Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Spring", 102),
                new Course("MS", 103)
        );
        Stream<Course>myCourseStream=myCourse.stream();

        //Creating stream from value
        Stream<Integer>stream=Stream.of(1,2,3,4,5,6,7);
        myCourseStream.findFirst();

    }

}
