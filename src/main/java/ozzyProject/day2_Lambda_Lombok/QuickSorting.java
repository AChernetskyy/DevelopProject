package ozzyProject.day2_Lambda_Lombok;

public class QuickSorting implements Sorting{
    @Override
    public void sort() {
        System.out.println("QuickSorting");
    }

    @Override
    public int string(String str) {
        return str.length();
    }
}
