package ozzyProject.day5.homePractice.traderPractice;

import java.util.Arrays;
import java.util.List;

public class TransactionTest {
    public static void main(String[] args) {
        Trader anton= new Trader("Anton", "Cambridge");
        Trader janna= new Trader("Janna", "Milan");
        Trader jack= new Trader("Jack", "OceanView");
        Trader nancy= new Trader("Nancy", "OceanView");
        Trader suzi= new Trader("Suzi", "Cambridge");

        List<Transaction>transactions = Arrays.asList(
                new Transaction(anton,2011, 300),
                new Transaction(nancy,2012, 1000),
                new Transaction(suzi,2022, 500),
                new Transaction(anton,2011, 900),
                new Transaction(janna,2011, 800),
                new Transaction(jack,2011, 900),
                new Transaction(anton,2011, 900)
        );
         // 1.Find all transactions in the year 2011 and sort them by value(small to high)
        System.out.println("Find all transactions in the year 2011 and sort them by value(small to high)");
        transactions.stream().filter(a->a.getYear()==2011).map(Transaction::getValue).sorted().forEach(System.out::println);

        // 2.What are all the unique cities where the traders work?
        System.out.println("What are all the unique cities where the traders work?");
        transactions.stream().map(a->a.getTrader().getCity()).distinct().forEach(System.out::println);//wrong

        // 3.Find all traders from Cambridge and sort them by name.
        System.out.println("3.Find all traders from Cambridge and sort them by name.");
        transactions.stream().filter(a->a.getTrader().getCity().equals("Cambridge")).map(a->a.getTrader().getName()).forEach(System.out::println);

        // 4.Return a string of all traders’ names sorted alphabetically
        System.out.println("Return a string of all traders’ names sorted alphabetically");
       transactions.stream().map(a->a.getTrader().getName()).sorted().forEach(System.out::println);

       // 5.Are any traders based in Milan?
        System.out.println("Are any traders based in Milan?");
        transactions.stream().filter(a->a.getTrader().getCity().equals("Milan")).forEach(System.out::println);


    }
}
