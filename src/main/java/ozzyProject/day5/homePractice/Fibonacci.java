package ozzyProject.day5.homePractice;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new int []{0,1}, n->new int[]{n[1],n[0]+n[1]})
                .limit(8).forEach(t-> System.out.print(t[1]+", "));
    }
}
