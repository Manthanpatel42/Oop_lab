import java.util.*;

class Search {
    static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        System.out.println(searchElement(l1, 2));

        LinkedList<String> l2 = new LinkedList<>();
        l2.add("A");
        l2.add("B");

        System.out.println(searchElement(l2, "B"));
    }
}