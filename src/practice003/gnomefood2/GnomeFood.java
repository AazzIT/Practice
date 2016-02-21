package practice003.gnomefood2;

import java.util.HashMap;
import java.util.Map;

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

        portions.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());

        System.out.println(gnomes.toString());
        System.out.println(portions.toString());

        for (int i = 0; i < portionWeights.length; i++) {
            Integer gnome = gnomes.get(i);
            Integer portion = portions.get(i);
            System.out.println(gnome + "  " + portion);
        }

        return result;
    }
}
