import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List checkSpeed(int count, List list) {
        for (int i = 0; i < count ; i++) {
            list.add(null);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> ls = new MyLinkedList<>();

        ls.add("Jim");
        ls.add("Jim");
        ls.add("Jim");
        ls.add("Jim");
        ls.add("Jim");

        System.out.println(ls.toString());
    }
}
