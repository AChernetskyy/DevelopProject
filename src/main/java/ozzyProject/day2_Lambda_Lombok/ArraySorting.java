package ozzyProject.day2_Lambda_Lombok;

public class ArraySorting {
    /*
    THIS CALLED BEHAVIOR PARAMETERIZATION
    Behavior parameterization is a software development pattern that lets you
handle frequent requirement changes.
It means, taking a block of code and making it available without executing. This
block of code can be called later by other parts of your programs.
You can pass the block of code as an argument to other method that will
execute later.
     */

    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        as.sort(new BubleSort());
        as.sort(new QuickSorting());
    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
