public class MergeSortAlgo {

    private void merge(int arr[], int left, int mid, int right) {

        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k++] = L[i++];
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    private void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int inputArr[] = {64, 34, 25, 12, 22, 11, 90};
        MergeSortAlgo msa = new MergeSortAlgo();
        msa.sort(inputArr, 0, inputArr.length - 1);
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }
}
