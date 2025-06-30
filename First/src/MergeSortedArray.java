public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 4, 5, 7, 9, 15};
        int n = arr.length + arr2.length;
        int[] ans = new int[n];
        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                ans[k++] = arr[i++];
            } else if (arr[i] == arr2[j]) {
                ans[k++] = arr[i++];
                ans[k++] = arr2[j++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        // Add remaining elements from arr
        while (i < arr.length) {
            ans[k++] = arr[i++];
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        for (int l = 0; l < k; l++) {
            System.out.print(ans[l] + ", ");
        }
    }
}
