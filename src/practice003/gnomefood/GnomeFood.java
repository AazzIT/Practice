package practice003.gnomefood;

import java.util.*;

public class GnomeFood {
    public static int[] find(int[] gnomesHeight, int[] portion) {
        int[] result = new int[gnomesHeight.length];
        Map mapGnomesPortions = new HashMap() {{}};
        for (int i = 0; i < gnomesHeight.length; i++) {
            mapGnomesPortions.put(i, gnomesHeight[i]);
        }

        List entryList = new ArrayList(mapGnomesPortions.entrySet());
        Collections.sort(entryList, (o1, o2) -> {
            Map.Entry e1 = (Map.Entry) o1;
            Map.Entry e2 = (Map.Entry) o2;
            Comparable c1 = (Comparable) e1.getValue();
            Comparable c2 = (Comparable) e2.getValue();
            return c1.compareTo(c2);
        });

        //int[] gnomesHeight = {5, 7, 6, 9, 4};
        //int[] portion =      {8, 5, 6, 2, 3};
        //int[] result =       {4, 2, 1, 0, 3};
        System.out.println(entryList);


        return result;
    }
    /*public static int[] find(int[] gnomesHeight, int[] portion) {
        int[] result = new int[gnomesHeight.length];
        TreeMap<Integer, Integer> mapGnomesHeights = new TreeMap<>();
        TreeMap<Integer, Integer> mapPortions = new TreeMap<>();

        for (int i = 0; i < gnomesHeight.length; i++) {
            mapGnomesHeights.put(gnomesHeight[i], i);
            mapPortions.put(portion[i], i);
        }
        Iterator iterGnomesHeights = mapGnomesHeights.values().iterator();
        Iterator iterPortions = mapPortions.values().iterator();

        while (iterGnomesHeights.hasNext()) {
            int i = (int) iterGnomesHeights.next();
            int j = (int) iterPortions.next();
            result[i] = j;
        }

        return result;
    }*/
}
