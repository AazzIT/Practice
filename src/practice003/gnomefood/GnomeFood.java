package practice003.gnomefood;

import java.util.Arrays;

public class GnomeFood {
    private static final class Gnome implements Comparable<Gnome>{
        private int index;
        private int height;
        public Gnome(int index, int height) {
            this.index = index;
            this.height = height;
        }

        @Override
        public int compareTo(Gnome o) {
            if (height > o.height) {
                return 1;
            } else if (height == o.height) {
                return 0;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return String.format("%d (%d)", height, index);
        }
    }

    private static final class Portion implements Comparable<Portion>{
        private int index;
        private int weight;
        public Portion(int index, int height) {
            this.index = index;
            this.weight = height;
        }

        @Override
        public int compareTo(Portion o) {
            if (weight > o.weight) {
                return 1;
            } else if (weight == o.weight) {
                return 0;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return String.format("%d (%d)", weight, index);
        }
    }

    public static int[] find(int[] gnomesHeights, int[] portionWeights) {
        int[] result = new int[portionWeights.length];
        Gnome[] gnomes = new Gnome[gnomesHeights.length];
        Portion[] portions = new Portion[gnomesHeights.length];

        for (int i = 0; i < gnomesHeights.length; i++) {
            gnomes[i] = new Gnome(i, gnomesHeights[i]);
        }

        for (int i = 0; i < portionWeights.length; i++) {
            portions[i] = new Portion(i, portionWeights[i]);
        }



        Arrays.sort(gnomes);
        Arrays.sort(portions);

        System.out.println(Arrays.asList(gnomes));
        System.out.println(Arrays.asList(portions));

        for (int i = 0; i < portionWeights.length; i++) {
            result[gnomes[i].index] = portions[i].index;
            System.out.println(result[portions[i].index]);
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
