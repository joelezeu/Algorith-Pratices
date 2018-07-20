package algostuff;

/**
 *
 * @author joel.eze
 */
public class EntranceExam {

    public static void main(String[] args) {
//        System.out.println(computeWeightedSum(new int[] {1, 2, 3, 4, 5}));
//        System.out.println(computeWeightedSum(new int[] {1, 3, 5}));
//        System.out.println(computeWeightedSum(new int[] {2, 4, 6}));
//        System.out.println(computeWeightedSum(new int[] {1}));
//        System.out.println(computeWeightedSum(new int[] {2}));
//        System.out.println(computeWeightedSum(new int[] {0, 0, 0, 0, 0}));
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));

    }

    public static int is123Array(int[] a) {
        int ret = 0;
        int count = 0;

        for (int i = 0, j = i + 1; i < a.length && j < a.length; i++, j++) {
            if (a[i] == 1 && a[j] == 2 && a[j + 1] == 3) {
                count++;
            }

        }
        if (a.length / 3 == count) {
            ret = 1;
        }
        return ret;
    }

    public static int is235Array(int[] a) {
        int len = a.length;
        int divisibleBy2 = 0;
        int divisibleBy3 = 0;
        int divisibleBy5 = 0;

        int notDivisible = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 == 0) {
                if (a[i] % 2 == 0) {
                    divisibleBy2++;
                }
                if (a[i] % 3 == 0) {
                    divisibleBy3++;
                }
                if (a[i] % 5 == 0) {
                    divisibleBy5++;
                }
            } else {
                notDivisible++;
            }
        }

        if (divisibleBy2 + divisibleBy3 + divisibleBy5 + notDivisible == len) {
            return 1;
        }
        return 0;

    }

    public static int computeWeightedSum(int[] a) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a == null) {
                return 0;
            }
            //Odd Numbers
            if (a[i] % 2 != 0) {
                oddSum = oddSum + a[i];
            }
            //Even Numbers
            if (a[i] % 2 == 0) {
                evenSum = evenSum + a[i];
            }

        }
        return (2 * evenSum) + (3 * oddSum);
    }
}
