import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //ArrayList - holds any number of objects and allows for duplicates
        ArrayList<String> pizzaToppings = new ArrayList<>();
        pizzaToppings.add("banana");
        pizzaToppings.add("onions");
        pizzaToppings.add("sausage");
        pizzaToppings.add("peppers");
        pizzaToppings.add("mushroom");
        pizzaToppings.add("pepperoni");
        pizzaToppings.add("spinach");
        pizzaToppings.add("spinach");
        pizzaToppings.add("basil");

        System.out.println(pizzaToppings);
        System.out.println("# of toppings: " + pizzaToppings.size());
        Collections.sort(pizzaToppings);
        System.out.println("Sorted: " + pizzaToppings);

        pizzaToppings.remove("spinach");
        System.out.println("Removing spinach: " + pizzaToppings);

        //if we want to prevent a duplicate from being added
        if (!pizzaToppings.contains("spinach"))
            pizzaToppings.add("spinach");

        //Sets do not allow for duplicates
        //HashSet - fast lookup capabilities as elements are "hashed"
        //TreeSet - elements are automatically sorted
        HashSet<String> pizzaToppingsHashSet = new HashSet();
        pizzaToppingsHashSet.add("banana");
        pizzaToppingsHashSet.add("onions");
        pizzaToppingsHashSet.add("sausage");
        pizzaToppingsHashSet.add("peppers");
        pizzaToppingsHashSet.add("mushroom");
        pizzaToppingsHashSet.add("pepperoni");
        pizzaToppingsHashSet.add("spinach");
        pizzaToppingsHashSet.add("spinach");
        pizzaToppingsHashSet.add("basil");

        System.out.println("Size of hashset after adding 9 elements with 1 duplicate: " + pizzaToppingsHashSet.size());
        System.out.println("HashSet: " + pizzaToppingsHashSet);

        //what data structure would prevent duplicates and automatically sort the elements?
        TreeSet<String> ptTreeSet = new TreeSet();
        ptTreeSet.add("banana");
        ptTreeSet.add("onions");
        ptTreeSet.add("sausage");
        ptTreeSet.add("peppers");
        ptTreeSet.add("mushroom");
        ptTreeSet.add("pepperoni");
        ptTreeSet.add("spinach");
        ptTreeSet.add("spinach");
        ptTreeSet.add("basil");
        System.out.println("Size of TreeSet after adding 9 elements with 1 duplicate: " + pizzaToppingsHashSet.size());
        System.out.println("TreeSet: " + ptTreeSet);



    }
}
