import Collections.CollectionArray;
import Collections.CollectionLink;
import Collections.CustomCollection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomCollection<Integer> coll = new CollectionArray<>();
        coll.add(5);
        coll.add(6);
        coll.add(7);
        System.out.println(coll.count());
        coll.remove(10);
        coll.count();

        CustomCollection<String> coll2 = new CollectionLink<>();
        coll2.add("a");
        coll2.add("b");
        coll2.add("c");
        System.out.println(coll2.count());
        coll2.remove(1);
        System.out.println(coll2.count());;
    }
}