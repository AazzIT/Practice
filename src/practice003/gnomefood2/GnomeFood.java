package practice003.gnomefood2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

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

        gnomes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());
                //.forEachOrdered(System.out::println);

        portions.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());
                //.forEachOrdered(System.out::println);

        System.out.println(gnomes.toString());
        System.out.println(portions.toString());

        for (int i = 0; i < portionWeights.length; i++) {
            result[gnomes.get(i)] = portions.get(i);
        }

        System.out.println(Arrays.asList(result));
        return result;
    }
}
