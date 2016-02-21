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
    }

    public int[] find(int[] gnomesHeights, int[] portionWeights) {
        int gnomeHeightsLength = gnomesHeights.length;
        int portionWeightsLength = portionWeights.length;
        int[] result = new int[portionWeightsLength];
        Gnome[] gnomes = new Gnome[gnomeHeightsLength];
        Portion[] portions = new Portion[gnomeHeightsLength];

        for (int i = 0; i < gnomeHeightsLength; i++) {
            gnomes[i] = new Gnome(i, gnomesHeights[i]);
        }

        for (int i = 0; i < portionWeights.length; i++) {
            portions[i] = new Portion(i, portionWeights[i]);
        }

        Arrays.sort(gnomes);
        Arrays.sort(portions);
        for (int i = 0; i < portionWeightsLength; i++) {
            result[gnomes[i].index] = portions[i].index;
        }

        return result;
    }
}
