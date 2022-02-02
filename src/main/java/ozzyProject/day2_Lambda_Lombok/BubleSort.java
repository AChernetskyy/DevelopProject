package ozzyProject.day2_Lambda_Lombok;

public class BubleSort implements Sorting{
    @Override
    public void sort() {
        System.out.println("BubbleSorting");
    }

    @Override
    public int string(String str) {
        return str.length();
    }
}
