package sam;

import java.util.function.BiPredicate;

public class bpi implements BiPredicate<String, Integer> {

    @Override
    public boolean test(String s, Integer integer) {
        if(s == "Scaler" && integer == 11){
            return true;
        }
        return false;
    }
}
