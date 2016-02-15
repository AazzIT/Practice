package practice003.gnomefood;

import java.util.*;

public class GnomeFood {
    public static int[] find(int[] gnomesHeight, int[] portion) {
        int[] result = new int[gnomesHeight.length];
        Map<Integer, Integer> mapGnomesHeights = new TreeMap<>();
        Map<Integer, Integer> mapPortions = new TreeMap<>();

        for (int i = 0; i < gnomesHeight.length; i++) {
            mapGnomesHeights.put(i, gnomesHeight[i]);
            mapPortions.put(i, portion[i]);
        }

        Comparator<Integer> compareGnomesHeight = (o1, o2) -> {
            int compare = mapGnomesHeights.get(o2).compareTo(mapGnomesHeights.get(o1));
            if (compare == 0) {
                return 1;
            } else {
                return compare;
            }
        };
        Comparator<Integer> comparePortions = (o1, o2) -> {
            int compare = mapPortions.get(o2).compareTo(mapPortions.get(o1));
            if (compare == 0) {
                return 1;
            } else {
                return compare;
            }
        };

        Map<Integer, Integer> sortedGnomesHeight = new TreeMap<>(compareGnomesHeight);
        sortedGnomesHeight.putAll(mapGnomesHeights);
        System.out.println(sortedGnomesHeight);
        Map<Integer, Integer> sortedPortions = new TreeMap<>(comparePortions);
        sortedPortions.putAll(mapPortions);
        System.out.println(sortedPortions);
        int i = 0;



        /*
        Iterator iterGnomesHeights = mapGnomesHeights.values().iterator();
        Iterator iterPortions = mapPortions.values().iterator();

        while (sortedGnomesHeight.) {
            int i = (int) iterGnomesHeights.next();
            int j = (int) iterPortions.next();
            result[i] = j;
        }


 */
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
