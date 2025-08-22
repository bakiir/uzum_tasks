import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String words = "";
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Words:");
        words = scanner.nextLine();

        System.out.println("n:");
        n = scanner.nextInt();

        String [] parts = words.split(" ");

        HashMap<String, Integer> parts_st = new HashMap<>();

        for(String p : parts){
            parts_st.put(p, parts_st.getOrDefault(p,0) + 1);
        }

        for (Map.Entry<String, Integer> entry : parts_st.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
            }
        }

    }
}