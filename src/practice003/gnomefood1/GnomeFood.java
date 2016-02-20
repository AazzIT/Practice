package practice003.gnomefood1;

import java.util.*;
import java.util.stream.Stream;

public class GnomeFood {
    public static int[] find(int[] gnomesHeights, int[] portionWeights) {
        int[] result = new int[portionWeights.length];

        Map<Integer, Integer> gnomes = new TreeMap<>();
        Map<Integer, Integer> portions = new TreeMap<>();

        for (int i = 0; i < gnomesHeights.length; i++) {
            gnomes.put(gnomesHeights[i], i);
        }

        for (int i = 0; i < portionWeights.length; i++) {
            portions.put(portionWeights[i], i);
        }

        Map<Integer,Integer> sortGnomeHeights = new LinkedHashMap<>();
        Stream<Map.Entry<Integer,Integer>> st = gnomes.entrySet().stream();

        st.sorted(Comparator.comparing(Map.Entry::getValue))
                .forEachOrdered(e ->sortGnomeHeights.put(e.getKey(),e.getValue()));

        Map<Integer,Integer> sortPortionWeights = new LinkedHashMap<>();
        st = gnomes.entrySet().stream();

        st.sorted(Comparator.comparing(Map.Entry::getValue))
                .forEachOrdered(e ->sortPortionWeights.put(e.getKey(),e.getValue()));

        System.out.println(sortGnomeHeights.toString());
        System.out.println(sortPortionWeights.toString());

        for (int i = 0; i < portionWeights.length; i++) {
            result[gnomes.get(i)] = portions.get(i);
            System.out.println(result[gnomes.get(i)]);
        }

        return result;
    }
    /*public static int[] find(int[] gnomesHeight, int[] portion) {
        int[] result = new int[gnomesHeight.length];
        Map<Integer, Integer> mapGnomesHeights = new TreeMap<>();
        Map<Integer, Integer> mapPortions = new TreeMap<>();

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
