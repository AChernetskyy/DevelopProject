package ozzyProject.day4.comparatorInterface;

import ozzyProject.day3.task_Lambda.Color;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,0,5,6,20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1,o2)->(o1>o2)? -1 : (o2<01) ? 1 : 0));
        System.out.println(list);
        list.sort((o1,o2)->o2.compareTo(o1));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        List<Apple>myInventory=Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(90, Color.RED),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );
        Comparator<Apple>sortApple=Comparator.comparing(apple->apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);
        myInventory.sort(Comparator.comparing(Apple::getWeight).reversed());

    }
}
