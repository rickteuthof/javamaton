package automata;
import java.util.*;
 
public class StateSet {
    private Set<String> set = new HashSet<>();

    public StateSet product(StateSet s2){
        StateSet product = new StateSet();
        for (String state1 : set) {
            for (String state2 : s2.set) {
                product.addState(state1 + state2);
            }
        }        
        return product;
    }

    public void addState(String state) {
        set.add(state);
    }

    public boolean contains(String state) {
        return set.contains(state);
    }

    public StateSet difference(StateSet s2) {
        StateSet diff = new StateSet();
        diff.set = set;
        diff.set.removeAll(s2.set);
        return diff;
    }

    public String toString() {
        String result = "{";
        for (String state : set) {
            result += state + ", ";
        }
        result += "}";
        return result;
    }
}
