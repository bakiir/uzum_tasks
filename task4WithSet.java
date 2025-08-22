import java.util.LinkedHashSet;
import java.util.Set;

public class task4WithSet {
    public static void main(String[] args) {
        int[] given = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        Set<Integer> uniques = new LinkedHashSet<>();

        for (int i = 0; i <= given.length - 1; i++) {
            uniques.add(given[i]);
        }

        Object[] result = uniques.toArray();

        System.out.print("[");
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("]");


    }
}


