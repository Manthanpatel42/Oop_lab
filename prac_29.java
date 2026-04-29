import java.util.*;

class Marks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(80);
        list.add(75);
        list.add(90);
        list.add(60);
        list.add(85);

        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}