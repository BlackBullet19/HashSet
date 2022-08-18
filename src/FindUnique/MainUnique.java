package FindUnique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainUnique {

        public static void main(String[] args) {

            MainUnique app = new MainUnique();

            int[] ints = {2, 3, 4, 2, 5, 3, 4, 6};
            int[] result = app.findMoreUniqueValue(ints);
            System.out.println("Unique values = " + Arrays.toString(result));
        }

        private int[] findMoreUniqueValue(int[] ints) {

            Set<Integer> integerSet = new HashSet<>();
            for (int i : ints) {
                boolean add = integerSet.add(i);
                if (!add) {
                    integerSet.remove(i);
                }
            }
            int[] result = new int[integerSet.size()];
            int i = 0;
            for (Integer values : integerSet) {
                result[i++] = values;
            }
            return integerSet.isEmpty() ? new int[0] : result;

        }
    }

