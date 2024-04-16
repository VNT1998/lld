package sam;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, Integer> bp = new bpi();
        System.out.println(bp.test("Scaler", 10));
    }
}
