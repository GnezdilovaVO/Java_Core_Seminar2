public class main {
    public static void main(String[] args) {
        System.out.println(countEvans(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvans(new int[]{2, 2, 0}));
        System.out.println(countEvans(new int[]{1, 3, 5}));
        System.out.println(diffMaxMin(new int[]{2, 3, 5, 1, 4}));
        System.out.println(ifIsNull(new int[]{1, 0, 0, 2, 3, 0}));
        System.out.println(ifIsNull(new int[]{1, 0, 2, 3, 0, 1}));

    }
    public static int countEvans(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int diffMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }
    public static boolean ifIsNull(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
//            if (array[array.length-2] == 0 && array[array.length -1] == 0) {
//                return true;
//            }
            if ((array[i] == 0 && array[i+1] == 0) || (array[array.length-2] == 0 && array[array.length -1] == 0)) {
                return true;
            }
        }
        return false;
    }
}
