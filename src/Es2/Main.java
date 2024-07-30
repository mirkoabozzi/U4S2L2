package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        System.out.println(func1(6));
        System.out.println(func2(func1(6)));
        System.out.println(func3(func1(6), true));

    }

    public static List func1(int n) {
        List<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newList.add(random.nextInt(0, 100));
        }
        sort(newList);
        return newList;
    }

    public static List func2(List list) {
        List<List> newList = new ArrayList<>();

        newList.addAll(list);
        newList.addAll(list.reversed());
        return newList;
    }

    public static List func3(List list, boolean b) {

        ArrayList newList = new ArrayList<>();

        if (b) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) newList.add(list.get(i));
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) newList.add(list.get(i));
            }
        }

        return newList;
    }

}
