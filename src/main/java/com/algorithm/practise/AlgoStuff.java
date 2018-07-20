/*
 * Maximum Subarray
  Given an array of  integers, find and print its number of negative subarrays on a new line.
 *
 */
package algostuff;

/**
 *
 * @author joel.eze
 */
public class AlgoStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {1, -2, 4, -5, 1};
        System.out.println(negativeSubarrays(A));
    }

    public static int maxSumArry(int array[]) {
        int ans = Integer.MIN_VALUE;
        int N = array.length; //Length of the Array.
        for (int start_index = 0; start_index < N; ++start_index) {
            int sum = 0;
            for (int sub_array_size = 1; sub_array_size <= N; ++sub_array_size) {
                if (start_index + sub_array_size > N) {
                    sum += array[start_index + sub_array_size - 1];
                    ans = Math.max(ans, sum);
                    break;
                }
            }
        }
        return ans;
    }

    public static int maxSubArray(int[] A) {
        int newsum = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            newsum = Math.max(newsum + A[i], A[i]);
            max = Math.max(max, newsum);
        }
        return max;
    }

    private static int negativeSubarrays(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }

}
