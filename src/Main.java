import java.util.*;

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

        //Create some "Friend" objects
        Friend fred = new Friend("Fred","Flintstone","705-555-1234");
        Friend barney = new Friend("Barney","Rubble","705-555-1235");
        Friend wilma = new Friend("Wilma","Flintstone","705-555-1236");

        //Add Friend's to an arraylist
        ArrayList<Friend> friendsAL = new ArrayList<>();
        friendsAL.addAll(Arrays.asList(fred, barney, wilma));
        System.out.println(friendsAL);
        Collections.sort(friendsAL);
        System.out.println("sorted: "+friendsAL);

        //HashSet
        HashSet<Friend> friendsHS = new HashSet<>();
        friendsHS.addAll(friendsAL);
        friendsHS.add(fred);
        System.out.println("Friends hashset size: "+ friendsHS.size());
        System.out.println("Friends hashSet: "+friendsHS);

        //TreeSet
        TreeSet<Friend> friendsTS = new TreeSet<>();
        friendsTS.addAll(friendsAL);
        System.out.println("Friends TreeSet size: "+ friendsTS.size());
        System.out.println("Friends TreeSet: "+friendsTS);

    }
}
