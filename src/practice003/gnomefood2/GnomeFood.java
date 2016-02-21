package practice003.gnomefood2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GnomeFood {
    public static int[] find(int[] gnomesHeights, int[] portionWeights) {
        int[] result = new int[portionWeights.length];

        Map<Integer, Integer> gnomes = new HashMap<>();
        Map<Integer, Integer> portions = new HashMap<>();

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
            //result[gnomes.get(i).intValue()] = portions.get(i).intValue();
            Integer gnome = gnomes.get(i);
            Integer portion = portions.get(i);
            System.out.println(gnome + "  " + portion);
        }

        //System.out.println(Arrays.asList(result));
        return result;
    }
}
