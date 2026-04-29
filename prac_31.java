import java.util.*;

class Playlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Song1");
        list.add("Song2");
        list.add("Song3");

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}