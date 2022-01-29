package ozzyProject.day3.functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User>users= new ArrayList<>();
        users.add(new User("Anton", "Small", 30));
        users.add(new User("Jeff", "Johns", 60));
        users.add(new User("Bill", "Small", 33));
        users.add(new User("Ann", "Setter", 22));
        users.add(new User("Kate", "Getter", 11));
        users.add(new User("Sam", "Big", 43));

        Consumer<User>printAll=i-> System.out.println(i);
        //printAll.accept();

        Predicate<User>filter=b->b.getFirstName().startsWith("E");
       // filter.test()
        //printName(users,p->true);
        printName(users, p->p.getLastName().startsWith("B"));
    }
    private static void printName(ArrayList<User>users, Predicate<User>p){
        for (User user: users) {
            if(p.test(user)){
                System.out.println(user);
            }
        }
    }
}
